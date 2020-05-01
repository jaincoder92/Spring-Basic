package org.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle1 implements ApplicationContextAware, BeanNameAware{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	private String beanName;
	
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void show(){
		System.out.println("PointA: "+pointA);
		System.out.println("PointB: "+pointB);
		System.out.println("PointC: "+pointC);
	}
	
	public void useAppContext(){
		Triangle1 triangle = (Triangle1) context.getBean("triangle1");
		System.out.println("----------------VIA APP CONTEXT AWARE--------------");
		triangle.show();
		System.out.println("----------------VIA BEAN NAME AWARE--------------");
		System.out.println("Bean name is: "+beanName);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
	
	@Override
	public void setBeanName(String name) {
		beanName = name;
	}

	
}
