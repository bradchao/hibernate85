package tw.brad.hi2.app;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.Member;

public class Brad08 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		try {
			Member member = memberDao.getMemberById(10);
			System.out.println(member.getName());
			
			memberDao.deleteMember(member);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
