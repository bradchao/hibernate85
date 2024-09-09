package tw.brad.hi2.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.brad.hi2.app.HibernateUtil;
import tw.brad.hi2.model.Account;

public class AccountCartDao {
	public void addAccount(Account account) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.persist(account);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public void updateAccount(Account account) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.merge(account);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public void remomveAccount(Account account) {
		Transaction transaction = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.remove(account);
			transaction.commit();
		}catch(Exception e) {
			System.out.println(e);
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
	
	public Account queryByAccountId(int id) throws Exception {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Account account = session.get(Account.class, id);
			return account;
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception();
		}
		
	}
	
	
}
