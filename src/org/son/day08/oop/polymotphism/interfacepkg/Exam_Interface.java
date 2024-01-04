package org.son.day08.oop.polymotphism.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
	}
}
