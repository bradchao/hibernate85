package tw.brad.hi2.app;

import java.util.LinkedList;
import java.util.List;

import tw.brad.hi2.dao.UserBikeDao;
import tw.brad.hi2.dao.UserDao;
import tw.brad.hi2.model.Bike;
import tw.brad.hi2.model.User;

public class Brad22 {

	public static void main(String[] args) {
		try {
			List<UserBikeDao> ubikes = UserBikeDao.queryJoinById(4);
			UserDao userDao = new UserDao();
			User user = userDao.queryById(ubikes.getFirst().getId());
			for (Bike bike: user.getBikes()) {
				System.out.println("bike:" + bike.getBid() + ":" + bike.getSpeed());
				bike.setSpeed(100);
			}
			
			userDao.update(user);
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
