package tw.brad.hi2.app;

import tw.brad.hi2.dao.AccountCartDao;
import tw.brad.hi2.model.Account;
import tw.brad.hi2.model.Cart;

public class Brad14 {

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.setStatus("shopping");
		//
		cart.setStatus("close");
		
		Account account = new Account();
		account.setAccount("kevin");
		account.setCart(cart);
		
		AccountCartDao dao = new AccountCartDao();
		dao.addAccount(account);
	}

}
