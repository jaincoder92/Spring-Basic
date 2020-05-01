package org.spring.client;

import org.spring.beans.Triangle2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient13 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring12.xml");
		Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
		triangle2.show();
		
		
	}
}
