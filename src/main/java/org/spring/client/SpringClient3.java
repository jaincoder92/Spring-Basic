package org.spring.client;

import org.spring.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringClient3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/spring2.xml");
		Employee employee = (Employee) context.getBean("employee");
		employee.show();
	}
}
