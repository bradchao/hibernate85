package tw.brad.hi2.app;

import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import tw.brad.hi2.dao.CourseDao;
import tw.brad.hi2.model.Course;

public class CourseMenu extends JComboBox<String>{
	private List<Course> courses;
	private CourseDao dao;
	
	public CourseMenu() {
		dao = new CourseDao();
		courses = dao.getAll();
		
		setModel(new MyModel());
	}
	
	public Course getSelectedCourse() {
		return courses.get(getSelectedIndex());
	}
	

	private class MyModel extends DefaultComboBoxModel<String> {

		@Override
		public int getSize() {
			return courses.size();
		}

		@Override
		public String getElementAt(int index) {
			return courses.get(index).getName();
		}
		
	}
	
}
