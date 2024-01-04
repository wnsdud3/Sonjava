package org.son.day07.exception.oop.point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super();
	}
	public ColorPoint(int x, int y,  String color) {
		super(x, y);
	}
	public void showColorPoint() {
		System.out.println(color + "색의 점");
		super.showPoint();
	}
}
