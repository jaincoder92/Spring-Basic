package org.spring.client;

import org.spring.beans.Triangle;
import org.spring.beans.Triangle1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient2 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext factory = new FileSystemXmlApplicationContext("src/main/resources/spring1.xml");
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
		
		
	}
}
