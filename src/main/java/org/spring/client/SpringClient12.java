package org.spring.client;


import org.spring.beans.Employee;
import org.spring.beans.Triangle1;
import org.spring.beans.Triangle2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient12 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring11.xml");
		Triangle1 triangle1 = (Triangle1) context.getBean("triangle1");
		triangle1.show();
		triangle1.useAppContext();
		System.out.println("------------TRIANGLE2-----------");
		Triangle1 triangle2 = (Triangle1) context.getBean("triangle2");
		triangle2.show();
	}
}
