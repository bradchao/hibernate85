package tw.brad.hi2.app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import tw.brad.hi2.dao.StudentDao;
import tw.brad.hi2.model.Student;

public class Brad28 extends JFrame {
	private CourseMenu menu;
	private Student student;
	private StudentDao dao;
	private JLabel name;
	private JButton add;
	
	public Brad28() {
		super("選課");
		
		dao = new StudentDao();
		student = dao.getById(2);
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		
		add = new JButton("Add");
		name = new JLabel(student.getName());
		top.add(name);
		menu = new CourseMenu();
		top.add(menu);
		top.add(add);
		
		add(top, BorderLayout.NORTH);
		
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				student.addCourse(menu.getSelectedCourse());
				dao.update(student);
				student = dao.getById(2);
			}
		});
	}

	public static void main(String[] args) {
		new Brad28();
	}

}
