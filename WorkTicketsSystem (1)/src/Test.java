import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.User;
import com.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Session session=HibernateUtil.getSession();
		Transaction transaction=session.beginTransaction();
		User user=new User();
		user.setId("9161068411");
		user.setName("ÕÅ·«");
		user.setPassword("9161068411");
		try {
			session.save(user);
			transaction.commit();
			
		}catch (Exception e) {
			System.out.println("Ìí¼ÓÊ§°Ü");
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}finally {
			HibernateUtil.closeSession();
		}
	}

}
