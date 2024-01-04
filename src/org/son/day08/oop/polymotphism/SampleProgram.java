package org.son.day08.oop.polymotphism;


class SuperClass{
	void paint() {
		draw(); // 동적바인딩에 의해 SupperClass의 draw가 아닌
	}			// SubClass의 draw()가 실행됨
	void draw() {
		System.out.println("Super Object");
	}
}

class Subclass extends SuperClass{
	void paint() {
		super.paint();
		super.draw(); // SuperClass의 paint() 실행
					  // 실행결과 : Sub Object
	}				  // SuperClass의 draw  실행
					  // 실행결과 : Super Object
	void draw() {
		System.out.println("Sub Object");
	}
}


public class SampleProgram {
	public static void main(String[] args) {
		SuperClass ex = new Subclass(); // 부모 타입의 참조 변수로
		ex.paint();						// 자식객체를 다루는 것
		ex.draw();						
	}

}
