package org.spring.client;

import org.spring.beans.Circle;
import org.spring.beans.Point;
import org.spring.beans.Triangle3;
import org.spring.beans.Triangle4;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient17 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring16.xml");
		Triangle4 triangle4 = (Triangle4) context.getBean("triangle4");
		triangle4.show();
		
		Circle circle = (Circle)context.getBean("circle");
		circle.show();
	}
}
