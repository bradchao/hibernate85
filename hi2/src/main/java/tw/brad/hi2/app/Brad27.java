package tw.brad.hi2.app;

import java.util.Set;

import tw.brad.hi2.dao.CourseDao;
import tw.brad.hi2.model.Course;
import tw.brad.hi2.model.Student;

public class Brad27 {

	public static void main(String[] args) {
		CourseDao dao = new CourseDao();
		Course course = dao.getById(4);
		Set<Student> students = course.getStudents();
		
		System.out.println(students.size());
		for (Student student : students) {
			System.out.println(student.getName());
		}
		
	}

}
