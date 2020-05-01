package org.spring.client;

import org.spring.beans.Triangle1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient5 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring4.xml");
		Triangle1 triangle1 = (Triangle1) context.getBean("triangle1");
		triangle1.show();
	}
}
