package org.son.day08.oop.polymotphism.overriding;

public class Shape {
	private String name;  // 캡슐화
	
	public  Shape() {}

	public void draw() {
		System.out.println("Shape Something");
	}
	
	// getter 메소드
	public String getName() {
		return this.name;
	}
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
}
