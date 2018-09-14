package com.service;

import java.util.List;

import com.bean.User;
import com.dao.Page;
import com.dao.UserDao;

public class UserManageService {
	
	//����û�����
	public void addUser(String id,String password,String name) {
		User user=new User();
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		user.setAdd(0);
		user.setDelete(0);
		user.setIeport(0);
		user.setQuery(0);
		user.setStatistics(0);
		UserDao userDao=new UserDao();
		userDao.insert(user);
	}
	//��ѯ�����û�
	public List<User> queryAllUsers(int startRows,int perPageRows){
		Page page=new Page();
		page.setCurrentPage(startRows);
		page.setPerPageRows(perPageRows);
		UserDao userDao=new UserDao();
		return userDao.queryAllUsers(page);
	}
	public int getCount() {
		UserDao userDao=new UserDao();
		return userDao.getCount();
	}
	//��������Ȩ��
	public void grantAdd(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantAdd(user);
	}
	//����ɾ��Ȩ��
	public void grantDelete(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
	}
	//���䵼�뵼��Ȩ��
	public void grantIeport(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantIeport(user);
	}
	//�����ѯȨ��
	public void grantQuery(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantQuery(user);
	}
	//����ͳ��Ȩ��
	public void grantStatistics(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantStatistics(user);
	}
	public boolean checkAdd(String id) {
		User user=new User();
		UserDao userDao=new UserDao();
		user.setId(id);
		
		return userDao.checkAdd(user);
	}
	public boolean checkIeport(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		return userDao.checkIeport(user);
	}
	public boolean checkDelete(String id) {
		User user=new User();
		UserDao userDao=new UserDao();
		user.setId(id);
		return userDao.checkDelete(user);
	}
	public boolean checkQuery(String id) {
		User user=new User();
		UserDao userDao=new UserDao();
		user.setId(id);
		return userDao.checkQuery(user);
	}
	public boolean checkStatistics(String id) {
		User user=new User();
		UserDao userDao=new UserDao();
		user.setId(id);
		return userDao.checkStatistics(user);
	}
	

}
