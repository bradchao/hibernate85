package tw.brad.hi2.app;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.BCrypt;
import tw.brad.hi2.model.Member;

public class Brad07 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAccount("brad1");
		member.setPasswd(BCrypt.hashpw("123456", BCrypt.gensalt()));
		member.setName("趙令文");

		MemberDao memberDao = new MemberDao();
		memberDao.addMember(member);
		
	}

}
