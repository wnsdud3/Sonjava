package org.son.day07.exception;

import java.util.Scanner;

public class Exam_Exception {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 하나 입력 :");
			int num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 :");
			int num2 = sc.nextInt();
			System.out.println("나눠드릴게요 조금만 기다리세요");
			int result = num1 / num2;
			System.out.printf("몫은 %d 입니다", result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("어? 0으로 못나누는데..?");
		}
	}

}
