package org.spring.client;


import org.spring.beans.Employee;
import org.spring.beans.Triangle1;
import org.spring.beans.Triangle2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient10 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring9.xml");
		Triangle1 triangle1 = (Triangle1) context.getBean("triangle1");
		System.out.println(triangle1.hashCode());
		Triangle1 triangle2 = (Triangle1) context.getBean("triangle1");
		System.out.println(triangle2.hashCode());
		Triangle1 triangle3 = (Triangle1) context.getBean("triangle1");
		System.out.println(triangle3.hashCode());
	}
}
