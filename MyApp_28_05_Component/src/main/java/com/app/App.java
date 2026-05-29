package com.app;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")){
			//ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
			Coach c =context.getBean(Coach.class,"coach");
			
			System.out.println(c.getDailyFortune());
			System.out.println(c.getDailyWorkout());
			
		}
	}

}
