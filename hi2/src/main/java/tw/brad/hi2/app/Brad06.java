package tw.brad.hi2.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.Member;

public class Brad06 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		try {
			List<Member> members = memberDao.getAll();
			for (Member member : members) {
				System.out.println(member.getAccount());
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
