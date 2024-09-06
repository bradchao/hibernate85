package tw.brad.hi2.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class Brad04 {

	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			
			String sql = "SELECT * FROM member";
			Transaction transaction = session.beginTransaction();
			
			Query query = session.createNativeQuery(sql);
			System.out.println(query.getResultCount());
			
			List<Object[]> results = query.getResultList();
			transaction.commit();
			
			
			for (Object[] result : results) {
				//System.out.println(result.length);
				System.out.println(result[2]);
			}
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
