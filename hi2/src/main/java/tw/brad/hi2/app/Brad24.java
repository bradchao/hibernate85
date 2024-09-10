package tw.brad.hi2.app;

import tw.brad.hi2.dao.CourseDao;
import tw.brad.hi2.model.Course;

public class Brad24 {

	public static void main(String[] args) {
		CourseDao dao = new CourseDao();
		
		Course course1 = new Course("PE");
		Course course2 = new Course("History");
		
		dao.add(course1);
		dao.add(course2);
	}

}
