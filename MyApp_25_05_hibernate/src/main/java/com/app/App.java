package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;


/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

//		Student s = new Student("Sai","Ambekar","Sai@gmail.com");
//		s.setFirstName("Ashish");
//		s.setLastName("Rathi");
//		s.setEmail("Ashish@gmail.com");
//		//session.save(s);
//		session.persist(s);
//		System.out.println("-----------------------------------------------------------------------");
//
//		System.out.println("enter the Id : ");
//		int id = scanner.nextInt();
//		
//		Student std = session.get(Student.class, id);
//		System.out.println(std);
//		System.out.println("-----------------------------------------------------------------------");
//
//		System.out.println("enter the Id : ");
//		int id1 = scanner.nextInt();
//		Student s1 = session.get(Student.class,id1);
//		s1.setEmail("Rathi@gmail.com");
//		//session.update(s1);
//		session.merge(s1);
//		System.out.println("-----------------------------------------------------------------------");
//
//		System.out.println("enter the Id : ");
//		int id2 = scanner.nextInt();
//		Student s2 = session.get(Student.class, id2);
//		//session.delete(s2);
//		session.remove(s2);
//		System.out.println("-----------------------------------------------------------------------");
//
//		//HQL 
//		System.out.println("-----------------------------------------------------------------------");
//		Query<Student> query = session.createQuery("from Student");
//		List<Student> list = query.list();
//		
//		list.forEach((x)->System.out.println(x));
//		System.out.println("-----------------------------------------------------------------------");
//
//		List<Student> l = session.createQuery("from Student").list();
//		l.forEach((x)->System.out.println(x));
//		
//		System.out.println("-----------------------------------------------------------------------");
		
		Query<Student> q = session.createQuery("from Student where lastName=:name");
		q.setParameter("name","Bade" );
		List<Student> l1 =q.list();
		l1.forEach((x)->System.out.println(x));;
		
		
		
		
		
		session.getTransaction().commit();

		session.close();
		factory.close();
		scanner.close();

	}
}
