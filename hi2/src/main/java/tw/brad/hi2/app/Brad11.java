package tw.brad.hi2.app;

import java.io.FileOutputStream;

import tw.brad.hi2.dao.MemberDao;
import tw.brad.hi2.model.Member;

public class Brad11 {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		try {
			Member member = memberDao.getMemberById(13);
			System.out.println(member.getName());
			
			byte[] icon = member.getIcon();
			new Thread() {
				public void run() {
					try {
						FileOutputStream fout = new FileOutputStream("dir2/brad.png");
						fout.write(icon);
						fout.flush();
						fout.close();
						System.out.println("OK");
					}catch(Exception e) {
						System.out.println(e);
					}
				};
			}.start();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
