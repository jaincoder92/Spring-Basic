package org.spring.beans;

import java.util.List;

public class Triangle2 {

	private List<Point> points;
	
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void show(){
		for(Point point : points)
		System.out.println("PointA: "+point);
	}
	
}
