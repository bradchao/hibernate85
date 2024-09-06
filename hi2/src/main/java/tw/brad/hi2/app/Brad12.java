package tw.brad.hi2.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tw.brad.hi2.model.Member;
import tw.brad.hi2.model.MemberInfo;

public class Brad12 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAccount("test1");
		member.setPasswd("123456");
		member.setName("Test1");
		
		MemberInfo info = new MemberInfo();
		info.setAddr("aaa");
		info.setPhone("123");;
		info.setBirthday("1999-02-03");
		
		member.setMemberInfo(info);
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction transaction = session.beginTransaction();
			
			session.persist(member);
			
			transaction.commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
