package tw.brad.hi2.app;

import tw.brad.hi2.dao.AccountCartDao;
import tw.brad.hi2.model.Account;

public class Brad16 {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccount("newbrad");
		
		AccountCartDao dao = new AccountCartDao();
		dao.addAccount(account);
	}

}
