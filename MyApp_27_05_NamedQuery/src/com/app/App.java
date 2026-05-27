package com.app;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

import jakarta.persistence.TypedQuery;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.openSession();

		session.beginTransaction();
		
		Employee e1 = new Employee("Ashish","Dev",60000);
		Employee e2 = new Employee("Rohit","Sec",41000);
		Employee e3 = new Employee("sidd","Hr",100000);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		
		TypedQuery<Employee> query = session.getNamedQuery("findByName");
		query.setParameter("name", "Ashish");
		
		List<Employee> emp = query.getResultList();
		emp.forEach(x->System.out.println(x));
		//emp.forEach(System.out.println());
		
		session.createNamedQuery("findByName",Employee.class).setParameter("name","sidd").list().forEach(System.out::println);

		
		
		

		session.getTransaction().commit();

		session.close();
		factory.close();
		scanner.close();
	}

}
