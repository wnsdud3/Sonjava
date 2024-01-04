package org.son.day08.oop.polymotphism.interfacepkg;

// 보라색 인터페이스는 상속할 때 implements 키워드를 씁니다
// extends 안씁니다. 인터페이스 안에 있는 추상메소드는 오버라이딩
// 하도록 강제하고 있습니다.
public class SamsungPhone implements PhoneInterface{

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("==== SAMSUNG====");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰으로 전화를 겁니다");
	}
	
}
