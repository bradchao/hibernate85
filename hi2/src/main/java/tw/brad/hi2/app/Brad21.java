package tw.brad.hi2.app;

import java.util.LinkedList;
import java.util.List;

import tw.brad.hi2.dao.UserBikeDao;
import tw.brad.hi2.dao.UserDao;
import tw.brad.hi2.model.Bike;
import tw.brad.hi2.model.User;

public class Brad21 {

	public static void main(String[] args) {
		try {
			List<UserBikeDao> ubikes = UserBikeDao.queryJoin();
			System.out.println(ubikes.size());
			
			List<User> users = new LinkedList<User>();
			int id = -1; int count = 0;
			for (UserBikeDao ubike : ubikes) {
				if (id != ubike.getId()) {
					User user = new UserDao().queryById(ubike.getId());
					users.add(user);
					id = ubike.getId();
				}
				
			}
			
			System.out.println("----");
			System.out.println(users.size());
			
			for (User user : users) {
				System.out.println(user.getName() + ":" + user.getBikes().size());
				List<Bike> bikes = user.getBikes();
				for (Bike bike: bikes) {
					System.out.println("bike:" + bike.getBid());
				}
				
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
