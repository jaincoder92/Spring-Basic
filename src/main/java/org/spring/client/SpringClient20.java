package org.spring.client;

import org.spring.beans.Point;
import org.spring.beans.Rectangle;
import org.spring.beans.Rectangle2;
import org.spring.beans.Triangle3;
import org.spring.beans.Triangle4;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient20 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring18.xml");
		Rectangle2 rectangle2 = (Rectangle2) context.getBean("rectangle2");
		rectangle2.show();
		
	}
}
