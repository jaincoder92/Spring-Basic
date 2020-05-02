package org.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Rectangle implements Shape{

	@Autowired
	private Point point1;
	@Autowired
	private Point point2;
	@Autowired
	private Point point3;
	@Autowired
	private Point point4;
	public Point getPoint1() {
		return point1;
	}
	public void setPoint1(Point point1) {
		this.point1 = point1;
	}
	public Point getPoint2() {
		return point2;
	}
	public void setPoint2(Point point2) {
		this.point2 = point2;
	}
	public Point getPoint3() {
		return point3;
	}
	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public Point getPoint4() {
		return point4;
	}
	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	@Override
	public void show() {
		System.out.println("Rentangle Point1 is: "+point1);
		System.out.println("Rentangle Point2 is: "+point2);
		System.out.println("Rentangle Point3 is: "+point3);
		System.out.println("Rentangle Point4 is: "+point4);
	}
	
}
