package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Student;


public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Course.class)
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction();

		//Student s1 = new Student("sai", "ambekar", "sai@gmail.com");
		Student s2 = new Student();
		s2.setfName("ashish");
		s2.setlName("rathi");
		s2.setEmail("ashish@gmail.com");
		
		//session.persist(s1);
		session.persist(s2);

		Course c1 = new Course("Java");
		//Course c2 = new Course("Cpp");
		Course c3 = new Course("ADS");
		//Course c4 = new Course("Java");

		c1.add(s2);
		//c2.add(s1);
		c3.add(s2);
		//c4.add(s1);

		session.persist(c1);
		//session.persist(c2);
		session.persist(c3);
		//session.persist(c4);

		session.getTransaction().commit();

		session.close();
		factory.close();
		scanner.close();

	}

}
