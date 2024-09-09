package tw.brad.hi2.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	private Set<Course> courses = new HashSet<Course>();
	
	public Student() {
	}
	public Student(String name) {
		this.name = name;
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
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		courses.add(course);
	}
	
}
