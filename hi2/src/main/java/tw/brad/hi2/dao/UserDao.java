package tw.brad.hi2.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.brad.hi2.app.HibernateUtil;
import tw.brad.hi2.model.User;

public class UserDao {
	public void save(User user) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.persist(user);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
		}
		
	}
	public void update(User user) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.merge(user);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
		}
		
	}
	
	public User queryById(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(User.class, id);
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	
	
}
