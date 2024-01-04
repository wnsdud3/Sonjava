package org.son.day08.oop.polymotphism.interfacepkg;

public interface PhoneInterface {
	public static final int Time_OUT = 10000; // 인터페이스는 상수형 필드
	// public String name; // 일반 필드 사용불가
	// public void sendCall () {};// 일반 메소드 사용불가
	abstract public void printLogo(); // 인터페이스는 추상메소드 필수
									  // 추상메소드만 가능
	void sendCall();			// abstract, public은 생략 가능
	public default void showLogo() {
		// 디폴트 메소드 (기능 추가)
		// 하위 호환성을 위해서 작성함
		// 인ㅌ처페이스의 보완을 위해 사용됨
	}
}
