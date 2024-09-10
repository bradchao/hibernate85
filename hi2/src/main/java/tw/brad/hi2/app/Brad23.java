package tw.brad.hi2.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.brad.hi2.model.Course;
import tw.brad.hi2.model.Student;

public class Brad23 {
	public static void main(String[] args) {
		
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			
			Student s1 = new Student("brad");
			
			Course c1 = new Course("Math");
			Course c2 = new Course("Eng");
			Course c3 = new Course("Chinese");
			
			s1.addCourse(c1);
			s1.addCourse(c2);
			s1.addCourse(c3);

			session.persist(s1);
			
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}
