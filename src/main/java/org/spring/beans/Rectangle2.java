package org.spring.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Rectangle2 implements Shape{

	@Autowired
	@Resource
	private Point point1;
	@Autowired
	@Resource
	private Point point2;
	@Autowired
	@Resource
	private Point point3;
	@Autowired
	@Resource(name="lastPoint")
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
