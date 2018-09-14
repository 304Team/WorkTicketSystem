package com.util;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.bean.User;

public class HibernateUtil {

	private static ThreadLocal<Session> threadLocal=new ThreadLocal<Session>();
    private static Configuration configuration=null;
    private static SessionFactory sessionFactory=null;
    static{
        
     try {
        configuration=new Configuration().configure("/hibernate.cfg.xml");
        sessionFactory=configuration.buildSessionFactory();
     } catch (HibernateException e) {
         System.out.println("����xml�ʹ���Session����error");
        e.printStackTrace();
    }
      
    }
   
    public static Session getSession(){
        Session session=threadLocal.get();
        if(session==null){
            session=sessionFactory.openSession();
            threadLocal.set(session);
        }
        return session;
    }
    public static void closeSession(){
        Session session=threadLocal.get();
        if(session!=null){
              threadLocal.set(null);
              session.close();
        }
    }
}
