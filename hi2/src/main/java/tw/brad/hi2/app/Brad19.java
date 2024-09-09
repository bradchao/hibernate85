package tw.brad.hi2.app;

import tw.brad.hi2.dao.AccountCartDao;
import tw.brad.hi2.model.Account;
import tw.brad.hi2.model.Cart;

public class Brad19 {

	public static void main(String[] args) {
		AccountCartDao dao = new AccountCartDao();
		
		try {
			Account account = dao.queryByAccountId(2);
			//Cart cart = account.getCart();
			
			//dao.remomveCart(cart);
			dao.remomveAccount(account);
			
		} catch (Exception e) {
			System.out.println(e);
		} 
	}

}
