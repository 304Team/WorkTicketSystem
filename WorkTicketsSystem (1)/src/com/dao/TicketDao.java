package com.dao;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.*;
import com.bean.Ticket;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.util.HibernateUtil;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class TicketDao {
	
	//新增工作票
	public void insert(Ticket ticket){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		
		try{
			session.save(ticket);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}finally{
			HibernateUtil.closeSession();
		}
	}
	//通过产生日期查询工作票
	public List<Ticket> queryByDate(Ticket ticket1,Ticket ticket2,Page page){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from ticket where firstoccurrence between ? and ?");
		query.setDate(0, ticket1.getFirstoccurrence());
		query.setDate(1, ticket2.getFirstoccurrence());
		query.setFirstResult(page.getCurrentPage());
		query.setMaxResults(page.getPerPageRows());
		List<Ticket> tickets=query.list();
		return tickets;
	}
	public List<Ticket> queryByDate(Ticket ticket1,Ticket ticket2){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from ticket where firstoccurrence between ? and ?");
		query.setDate(0, ticket1.getFirstoccurrence());
		query.setDate(1, ticket2.getFirstoccurrence());
		List<Ticket> tickets=query.list();
		return tickets;
	}
	//从数据库导出工作票
	public int exportExcel(List<Ticket> tickets) {
		Field[] fields=null;
		String result="";
		if(tickets.size()==0||tickets==null) {
			return 0;
		}
		else {
			Ticket ticket=tickets.get(0);
			Class class1=ticket.getClass();
			String classname=ticket.getIpccustomer();
			fields=class1.getDeclaredFields();
			File folder=new File("C:/Users/DELL/Desktop/tickets");
			if(!folder.exists()) {
				folder.mkdirs();
			}
			SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
			String filename=simpleDateFormat.format(new Date());
			String name = filename.concat(".xls");
			WritableWorkbook writableWorkbook=null;
			File file = null;
			try {
				file = new File("C:/Users/DELL/Desktop/tickets".concat(File.separator).concat(name));
				writableWorkbook=Workbook.createWorkbook(file);
				WritableSheet writableSheet=writableWorkbook.createSheet(classname, 0);
				int i=0;
				int j=0;
				for(Field field:fields) {
					j = 0;
					Label label = new Label(i, j, field.getName()); // 这里把字段名称写入excel第一行中
					writableSheet.addCell(label);
					j = 1;
					for (Object obj : tickets) {
						Object temp = getFieldValueByName(field.getName(), obj);
						String strTemp = "";
						if (temp != null) {
							strTemp = temp.toString();
						}
						writableSheet.addCell(new Label(i, j, strTemp)); // 把每个对象此字段的属性写入这一列excel中
						j++;
					}
					i++;
				}
			}catch (IOException e) {
				e.printStackTrace();
				// TODO: handle exception
			}catch (RowsExceededException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (WriteException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				filename=null;
				name=null;
				folder=null;
				file=null;
				if(writableWorkbook!=null){
                    try {
                        writableWorkbook.close();
                    } catch (WriteException e) {
                        // TODO Auto-generated catch block
                        result = "WriteException";
                        e.printStackTrace();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        result = "IOException";
                        e.printStackTrace();
                    }
                }

			}
			
		}
		return fields.length;
	}
	public Object getFieldValueByName(String fieldName, Object o) {
		try {
	           String firstLetter = fieldName.substring(0, 1).toUpperCase();    
	           String getter = "get" + firstLetter + fieldName.substring(1);    //获取方法名
	           Method method = o.getClass().getMethod(getter, new Class[] {});  //获取方法对象
	           Object value = method.invoke(o, new Object[] {});    //用invoke调用此对象的get字段方法
	           return value;  //返回值
	       } catch (Exception e) {
	           e.printStackTrace();
	           return null;    
	       }    
	}
	//导入工作票到数据库
	public List<Ticket> importExcel(String path){
		List<Ticket> tickets=new ArrayList<Ticket>();
		try {
			InputStream inputStream = new FileInputStream(path);
			Workbook workbook=Workbook.getWorkbook(inputStream);
			int sheet_size=workbook.getNumberOfSheets();
			for(int i=0;i<sheet_size;i++) {
				for(int j=0;j<workbook.getSheet(i).getRows();j++) {
					Ticket ticket=new Ticket();
					for(int k=0;k<workbook.getSheet(i).getColumns();k++) {
						if(workbook.getSheet(i).getCell(k, 0).getContents().equals("ipccustomer")) {
							ticket.setIpccutomer(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("customercode")) {
							ticket.setCustomercode(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("cause")) {
							ticket.setCause(workbook.getSheet(i).getCell(k,j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("summary")) {
							ticket.setSummary(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("componenttype")) {
							ticket.setComponenttype(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("ostype")) {
							ticket.setOstype(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("identifier")) {
							ticket.setIdentifier(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("ticketstatus")) {
							ticket.setTicketstatus(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, j).getContents().equals("lastoccurrence")) {
							SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
							Date date=simpleDateFormat.parse(workbook.getSheet(i).getCell(k, j).getContents());
							java.sql.Date sDate=new java.sql.Date(date.getTime());
							ticket.setLastoccurrence(sDate);
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("node")) {
							ticket.setNode(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("resolution")) {
							ticket.setResolution(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("servername")) {
							ticket.setServername(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k,j).getContents().equals("alertgroup")) {
							ticket.setAlertgroup(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, j).getContents().equals("component")) {
							ticket.setComponent(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, 0).getContents().equals("ticketnumber")) {
							ticket.setTicketnumber(workbook.getSheet(i).getCell(k, j).getContents());
						}else if (workbook.getSheet(i).getCell(k, j).getContents().equals("firstoccurrence")) {
							SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
							Date date=simpleDateFormat.parse(workbook.getSheet(i).getCell(k, j).getContents());
							java.sql.Date sDate=new java.sql.Date(date.getTime());
							ticket.setFirstoccurrence(sDate);
						}else if (workbook.getSheet(i).getCell(k, j).getContents().equals("severity")) {
							ticket.setSeverity(workbook.getSheet(i).getCell(k, j).getContents());
						}
						
					}
					tickets.add(ticket);
				}
			}
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ParseException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return tickets;
	}
	//查看所有工作票
	public List<Ticket> findAllTickets(Page page){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from ticket");
		query.setFirstResult(page.getCurrentPage());
		query.setMaxResults(page.getPerPageRows());
		List<Ticket> tickets=query.list();
		return tickets;
	}
	//统计工作票
	


	
	
}
