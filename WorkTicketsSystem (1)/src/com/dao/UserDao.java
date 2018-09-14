package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bean.User;
import com.util.HibernateUtil;


public class UserDao {
	
	//添加用户
	public void insert(User user){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		try{
			session.save(user);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}finally{
			HibernateUtil.closeSession();
		}
	}
	//查询用户id和密码是否匹配
	public int query(User user1){
		User user =null;
		Session session=HibernateUtil.getSession();
		user=(User)session.load(User.class, user1.getId());
		if(user==null||"".equals(user)){
			return -1;
		}
		else{
			if(user.getPassword()==user1.getPassword())
				return 1;
			else
				return 0;
		}
	}
	//查询所有用户
	public List<User> queryAllUsers(Page page){
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select id,name,add,delete,ieport,query,statistics from user");
		query.setFirstResult(page.getStartRows());
		query.setMaxResults(page.getPerPageRows());
		List<User> users=query.list();
		return users;
	}
	public int getCount() {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("select count(*) from User");
		return ((Number)query.uniqueResult()).intValue();
	}
	
	//更新add属性
	public void grantAdd(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		user2.setAdd(1);
		session.update(user);
		
	}
	//更新delete属性
	public void grantDelete(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		user2.setDelete(1);
		try {
			session.update(user);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}finally {
			HibernateUtil.closeSession();
		}
		
	}
	//更新ieport属性
	public void grantIeport(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		user2.setIeport(1);
		try {
			session.update(user2);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}finally {
			HibernateUtil.closeSession();
		}
	}
	
	//更新query属性
	public void grantQuery(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		user2.setIeport(1);
		try {
			session.update(user2);
			transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}finally {
			HibernateUtil.closeSession();
		}
	}
	//更新statistics属性
	public void grantStatistics(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		user2.setStatistics(1);
		try {
			session.update(user2);
			transaction.commit();
		}catch(Exception e) {
			e.printStackTrace();
		    transaction.rollback();
		}finally {
			HibernateUtil.closeSession();
		}
	}
	//查询是否有add权限
	public boolean checkAdd(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		if(user2.getAdd()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean checkIeport(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction =session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		if(user2.getIeport()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean checkQuery(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		if(user2.getQuery()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean checkStatistics(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		if(user2.getStatistics()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	public boolean checkDelete(User user) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getId());
		if(user2.getDelete()==0) {
			return false;
		}
		else {
			return true;
		}
	}
	

}
