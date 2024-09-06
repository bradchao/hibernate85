package tw.brad.hi2.app;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.Member;

public class Brad09 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		try {
			Member member = memberDao.getMemberById(6);
			System.out.println(member.getAccount());
			
			member.setAccount("brad");
			
			memberDao.updateMember(member);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
