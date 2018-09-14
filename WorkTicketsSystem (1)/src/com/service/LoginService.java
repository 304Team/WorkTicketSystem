package com.service;

import com.bean.Manager;
import com.bean.User;
import com.dao.ManagerDao;
import com.dao.UserDao;

import java.util.regex.*;



public class LoginService {
	//��ͨ�û���¼
	public int userLogin(String id,String password){
		User user=new User();
		UserDao userDao=new UserDao();
		user.setId(id);
		user.setPassword(password);
		if(userDao.query(user)==1){
			return 1;
		}
		else if(userDao.query(user)==0){
			return 0;
		}
		else {
			return -1;
		}
	}
	//ϵͳ����Ա��¼
	public int managerLogin(String id,String password){
		Manager manager=new Manager();
		ManagerDao managerDao=new ManagerDao();
		manager.setId(id);
		manager.setPassword(password);
		if(managerDao.query(manager)==1){
			return 1;
		}
		else if(managerDao.query(manager)==0){
			return 0;
		}
		else{
			return -1;
		}
	}
	//�жϹ����Ƿ�ȫΪ�������Ƿ�Ϊ10λ
	public boolean isNumber(String id){
		for (int i = id.length();--i>=0;){  
			 if (!Character.isDigit(id.charAt(i))||id.length()!=10){
				 return false;
				 
			 }
		 }
		 return true;
	}
	//�ж������Ƿ��������ַ�
	public boolean isSpecialChar(String password){
		String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~��@#��%����&*��������+|{}������������������������]|\n|\r|\t";
	    Pattern p = Pattern.compile(regEx);
	    Matcher m = p.matcher(password);
	    return m.find();
	}

}
