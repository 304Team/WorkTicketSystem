package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Page;
import com.service.UserManageService;

/**
 * Servlet implementation class PageServlet
 */
@WebServlet("/PageServlet")
public class PageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserManageService userManageService=new UserManageService();
	private Page page=new Page();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int currentPage;
		  String p=request.getParameter("p");
		  if(p==null||p.equals("0")){
		  currentPage=1;
		  }
		  else{
		  currentPage = Integer.parseInt(p);
		  }
		  int perPageRows = 10;//ÿҳ��ʾ������
		  int startRows=(currentPage-1)*perPageRows;//��ʼ����
		  int endRows=currentPage*perPageRows;//��������
		  int totalRows=userManageService.getCount();//�ܼ�¼��
		  int totalPages;
		  if(totalRows%11==0){
			  totalPages=totalRows/10;
		  }
		  else{
			  totalPages=totalRows/10+1;
		  }
		  if(endRows>totalRows-1){
			  endRows=totalRows;
		  }
          request.getSession().setAttribute("currentPage", currentPage);
          request.getSession().setAttribute("perPagerows", perPageRows);
          request.getSession().setAttribute("totalPages", totalPages);
          request.getSession().setAttribute("totalRows", totalRows);
          request.getSession().setAttribute("startRows", startRows);
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
