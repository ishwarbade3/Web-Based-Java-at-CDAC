package com.app;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Course;
import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction();
		
//		int  i = 1;
//		 Instructor inst = session.get(Instructor.class, i);
//		 Course c1 = new Course("Java");
//		 Course c2 = new Course("Database");
//		 Course c3 = new Course("Servlet");
//		 
//		 Instructor inst1 = session.get(Instructor.class, 2);
//		 inst1.getCourse().add(c3);
//
//		 
//		 inst.add(c1);
//		 inst.add(c2);
//		 inst1.add(c3);
//		 
//		 session.persist(c1);
//		 session.persist(c2);
//		 session.persist(c3);
		 
		 
		 
//		 session.remove(session.get(InstructorDetails.class, 2));
//		 Instructor i1 = session.get(Instructor.class, 2);
//		 i1.setInstructorDetail(null);
		InstructorDetails details =
		        session.get(InstructorDetails.class, 5);

		Instructor instructor =
		        details.getInstructor();

		instructor.setInstructorDetail(null);

		session.remove(details);
		 
//		 session.remove(session.get(Instructor.class, 3));
//		 InstructorDetails id1 = session.get(InstructorDetails.class, 3);
//		 id1.setInstructor(null);
		 
		 
		session.getTransaction().commit();

		session.close();
		factory.close();
		scanner.close();
	}

}
