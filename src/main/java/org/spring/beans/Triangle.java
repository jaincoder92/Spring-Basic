package org.spring.beans;

public class Triangle {

	private int side1;
	private int side2;
	private int side3;
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	
	public void draw(){
		System.out.println("Side1 is: "+side1);
		System.out.println("Side2 is: "+side2);
		System.out.println("Side3 is: "+side3);
	}
}
