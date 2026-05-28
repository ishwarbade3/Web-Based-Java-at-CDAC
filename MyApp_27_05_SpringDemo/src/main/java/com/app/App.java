package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Ishwar" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");        
        Bsnl b = context.getBean(Bsnl.class,"bsnl");
        b.calling();
        b.data();
       
    }
}
