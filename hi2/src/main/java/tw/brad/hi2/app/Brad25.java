package tw.brad.hi2.app;

import tw.brad.hi2.dao.StudentDao;
import tw.brad.hi2.model.Student;

public class Brad25 {

	public static void main(String[] args) {
		Student s1 = new Student("John");
		Student s2 = new Student("Mary");
		Student s3 = new Student("Kevin");
		
		StudentDao dao = new StudentDao();
		dao.add(s1);
		dao.add(s2);
		dao.add(s3);
	}

}
