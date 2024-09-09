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
			List<UserBikeDao> ubikes = UserBikeDao.queryJoinById(5);
			User user = new UserDao().queryById(ubikes.getFirst().getId());
			for (Bike bike: user.getBikes()) {
				System.out.println("bike:" + bike.getBid());
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
