package org.spring.beans;

public class Triangle4 implements Shape{

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
}
