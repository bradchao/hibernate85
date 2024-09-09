package tw.brad.hi2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import tw.brad.hi2.app.HibernateUtil;

public class UserBikeDao {
	private int id;
	private String name;
	private int bid;
	private int uid;
	private String color;
	private double speed;
	
	public UserBikeDao(int id, String name, int bid, int uid, String color, double speed) {
		this.id = id;
		this.name = name;
		this.bid = bid;
		this.uid = uid;
		this.color = color;
		this.speed = speed;
	}
	
	public static List<UserBikeDao> queryJoin() {
		String sql = "SELECT u.id id, u.name name, b.bid bid, b.uid uid, b.color color, b.speed speed " + 
					"FROM user u JOIN bike b ON u.id = b.uid";
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			NativeQuery<UserBikeDao> result = session.createNativeQuery(sql, UserBikeDao.class);
			return result.list();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	
	
	
}
