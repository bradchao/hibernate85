package tw.brad.hi2.app;

import tw.brad.hi2.dao.AccountCartDao;
import tw.brad.hi2.model.Account;
import tw.brad.hi2.model.Cart;

public class Brad18 {

	public static void main(String[] args) {
		AccountCartDao dao = new AccountCartDao();
		try {
			Account account = dao.queryByAccountId(3);
			
//			account.setCart(null);
//			dao.updateAccount(account);
			
			Cart cart = dao.queryCartByCardId(3);
			account.setCart(cart);
			
			dao.updateAccount(account);
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
