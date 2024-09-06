package tw.brad.hi2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import tw.brad.hi2.app.HibernateUtil;
import tw.brad.hi2.model.Member;

public class MemberDao {

	// add Member
	public void addMember(Member member) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction transaction = session.beginTransaction();
			
			session.persist(member);
			
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public List<Member> getAll() throws Exception {
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			
			String hql = "FROM Member";
			Query<Member> query = session.createQuery(hql, Member.class);
			return query.getResultList();
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception();
		}		
		
	}
}
