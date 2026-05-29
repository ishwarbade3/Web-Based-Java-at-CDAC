package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("hello Ishwar");
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ){
			Human h = context.getBean(Human.class,"human");
			h.pump();
			
		
		}
	}

}
