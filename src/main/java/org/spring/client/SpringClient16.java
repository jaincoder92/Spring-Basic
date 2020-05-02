package org.spring.client;

import org.spring.beans.Point;
import org.spring.beans.Triangle3;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient16 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring15.xml");
		Triangle3 triangle3 = (Triangle3) context.getBean("triangle3");
		triangle3.show();
		
	}
}
