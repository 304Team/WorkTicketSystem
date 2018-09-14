package com.dao;
import org.hibernate.Session;

import com.bean.Manager;
import com.bean.User;
import com.util.HibernateUtil;

public class ManagerDao {
	public int query(Manager manager){
		Manager manager2=null;
		Session session=HibernateUtil.getSession();
		manager2=(Manager)session.get(Manager.class,manager.getId());
		if(manager2==null||"".equals(manager2)){
			return -1;
		}
		else{
			if(manager2.getPassword()==manager.getPassword())
				return 1;
			else
				return 0;
		}
	}

}
