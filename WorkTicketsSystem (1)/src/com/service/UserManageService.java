package com.service;

import java.util.List;

import com.bean.User;
import com.dao.Page;
import com.dao.UserDao;

public class UserManageService {
	
	//添加用户服务
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
	//查询所有用户
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
	//分配新增权限
	public void grantAdd(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantAdd(user);
	}
	//分配删除权限
	public void grantDelete(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
	}
	//分配导入导出权限
	public void grantIeport(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantIeport(user);
	}
	//分配查询权限
	public void grantQuery(String id) {
		User user=new User();
		user.setId(id);
		UserDao userDao=new UserDao();
		userDao.grantQuery(user);
	}
	//分配统计权限
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
