package com.app;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Instructor;
import com.app.entity.InstructorDetails;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetails.class).buildSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction();

		// InstructorDetails ID1 = new InstructorDetails("RCB_fanclub","Cricket");
		// Instructor I1 = new
		// Instructor("Ishwar","Bade","Ishwar@gmail.com",77400.40f,ID1);
		// session.persist(I1);

//		InstructorDetails ID1 = new InstructorDetails();
//		ID1.setHobby("Batminton");
//		ID1.setYoutube_channel("Jat_the _Greate");
//		
//		Instructor I1 = new Instructor();
//		I1.setFName("Ashish");
//		I1.setLName("Rathi");
//		I1.setEmail("Ashish@gamil.com");
//		I1.setSalary(89500.46f);
//		I1.setInstructorDetail(ID1);
//		
//		session.persist(I1);

//		InstructorDetails ID1 = new InstructorDetails("Youtuber_world","Football");
//		Instructor I1 =new Instructor("sai","ambekar","sai@gmail.com",77200.45f);
//		I1.setInstructorDetail(ID1);
//		
//		session.persist(I1);

//		Instructor I = session.get(Instructor.class, 1);
//		System.out.println(I);
//
//		System.out.println("-------------------------------");
//
//		Instructor I1 = session.get(Instructor.class, 2);
//		I1.getInstructorDetail().setHobby("Pujari...");
//		session.merge(I1);
//		System.out.println("-------------------------------");
//
//		Query<Instructor> query = session.createQuery("from Instructor");
//		List<Instructor> list = query.list();
//		list.forEach((x) -> System.out.println(x));
//		;
//		System.out.println("-------------------------------");
//
//		Predicate<Instructor> p1 = (i) -> i.getInstructorDetail().getHobby().equals("Cricket");
//		list.stream().filter(p1).forEach((x) -> System.out.println(x));
//
//		System.out.println("-------------------------------");
//
//		float total = (float) list.stream().mapToDouble((i) -> i.getSalary()).sum();
//		System.out.println("Total Salary : " + total);
		
		Instructor inst = new Instructor("sai","ambekar","sai@gmail.com",50000.26f);
		
		InstructorDetails idetail = new InstructorDetails("Coddeing_ninja", "reading");
		inst.setInstructorDetail(idetail);
		idetail.setInstructor(inst);
		session.persist(idetail);

		session.getTransaction().commit();

		session.close();
		factory.close();
		scanner.close();

	}

}
