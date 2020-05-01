package org.spring.client;


import org.spring.beans.Triangle;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class SpringClient1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource(("src/main/resources/spring1.xml")));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
		
	}
}
