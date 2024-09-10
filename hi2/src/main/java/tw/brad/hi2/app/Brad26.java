package tw.brad.hi2.app;

import tw.brad.hi2.dao.CourseDao;
import tw.brad.hi2.dao.StudentDao;
import tw.brad.hi2.model.Course;
import tw.brad.hi2.model.Student;

public class Brad26 {

	public static void main(String[] args) {
		StudentDao daoStudent = new StudentDao();
		CourseDao daoCourse = new CourseDao();
		
		Student student = daoStudent.getById(3);
		if (student != null) {
			System.out.println(student.getName() + ":" + student.getCourses().size());
			
			Course c4 = daoCourse.getById(4);
			Course c5 = daoCourse.getById(5);
			Course c6 = daoCourse.getById(6);
			
			System.out.println(c4.getName());
			System.out.println(c5.getName());
			System.out.println(c6.getName());
			
			student.addCourse(c4);
			student.addCourse(c5);
			student.addCourse(c6);
			
			daoStudent.update(student);
			
		}else {
			System.out.println("Student Not Found");
		}
	}

}
