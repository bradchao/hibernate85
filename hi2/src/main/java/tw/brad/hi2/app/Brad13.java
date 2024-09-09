package tw.brad.hi2.app;

import tw.brad.hi2.dao.AccountCartDao;
import tw.brad.hi2.model.Account;
import tw.brad.hi2.model.Cart;

public class Brad13 {

	public static void main(String[] args) {
		Account account = new Account();
		account.setAccount("tony");
		
		Cart cart = new Cart();
		cart.setStatus("shopping");
		
		account.setCart(cart);
		
		AccountCartDao dao = new AccountCartDao();
		dao.addAccount(account);
		
	}

}
