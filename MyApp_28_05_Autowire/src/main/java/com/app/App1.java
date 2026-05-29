package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	public static void main(String[] args) {
		System.out.println("Hello Ishwar");

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ){
			Student s = context.getBean(Student.class,"student");
			System.out.println(s);
		}
	}

}
