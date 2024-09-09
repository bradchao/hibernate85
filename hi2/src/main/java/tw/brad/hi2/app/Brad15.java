package tw.brad.hi2.app;

import tw.brad.hi2.dao.AccountCartDao;
import tw.brad.hi2.model.Account;
import tw.brad.hi2.model.Cart;

public class Brad15 {

	public static void main(String[] args) {
		AccountCartDao dao = new AccountCartDao();
		try {
			Account account = dao.queryByAccountId(2);
			System.out.println("------");
			System.out.println(account.getAccount());
			System.out.println("------");
			
			Cart cart = account.getCart();
			if (cart != null) {
				System.out.println(cart.getStatus());
			}else {
				System.out.println("cart is NULL");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
