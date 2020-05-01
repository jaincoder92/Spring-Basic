package org.spring.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle3 implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean has been afterPropertiesSet.");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean has been destroy.");
	}
	
	public void init(){
		System.out.println("Bean has been init.");
	}
	
	public void destruction(){
		System.out.println("Bean has been destruction.");
	}
	
	
	
}
