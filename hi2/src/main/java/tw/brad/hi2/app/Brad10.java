package tw.brad.hi2.app;

import java.util.List;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.Member;

public class Brad10 {

	public static void main(String[] args) {
		
		String hql = "FROM Member member WHERE member.name LIKE '%文%'";
		MemberDao memberDao = new MemberDao();
		try {
			List<Member> members = memberDao.getByWhere(hql);
			//System.out.println(members.size());
			for (Member member : members) {
				System.out.println(member.getAccount() + ":" + member.getName());
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
