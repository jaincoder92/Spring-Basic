package org.spring.client;

import org.spring.beans.Point;
import org.spring.beans.Triangle3;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient14 {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring13.xml");
		context.registerShutdownHook();
		Triangle3 triangle3 = (Triangle3) context.getBean("triangle3");
		
		
	}
}
