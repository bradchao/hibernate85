package tw.brad.hi2.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.BCrypt;
import tw.brad.hi2.model.Member;

public class Brad07 {

	public static void main(String[] args) {
		Member member = new Member();
		member.setAccount("amy");
		member.setPasswd(BCrypt.hashpw("123456", BCrypt.gensalt()));
		member.setName("艾米");
		
		File file = new File("dir1/ball3.png");
		try {
			FileInputStream fin = new FileInputStream(file);
			byte[] icon = fin.readAllBytes();
			member.setIcon(icon);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		MemberDao memberDao = new MemberDao();
		memberDao.addMember(member);

		
	}

}
