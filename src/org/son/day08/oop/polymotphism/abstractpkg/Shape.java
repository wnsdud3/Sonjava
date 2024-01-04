package org.son.day08.oop.polymotphism.abstractpkg;

class LIne extends Shape {
	@Override
	public void deaw() {
		// 추상 메소드는 오버라이딩을 강제한다.
	}
}

// 추상메소드가 있는 클래스는 추상클래스가 됨
// 추상클래스가 꼭 추상메소드를 가져야되는 것은 아님
public abstract class Shape {
	private String name;
	public Shape() {
	}
	// 몸체 없는 메소드인 추상메소드로 작성
	abstract public void deaw();
	public void paint() {}
}
