package org.son.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_For2 {
	public static void main(String [] args) {
		// 정수를 하나 입력받아서 그 수가 1~9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요
		// 단 조건이 맞지 않으면 "1~9사이의 양수를 입력하여야
		// 합니다"를 출력하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 :");
		int dan = sc.nextInt();
		if(dan >=1 && dan <= 9) {
			for(int i =1; i <= 9; i++)
				System.out.println(dan+"*"+i+"="+dan*i);
					}
//	System.out.println("2*2=4");
//	System.out.println("2*3=6");
//	System.out.println("2*4=8");
//	System.out.println("2*5=10");
//	System.out.println("2*6=12");
//	System.out.println("2*7=14");
//	System.out.println("2*8=16");
//	System.out.println("2*9=18");
	}
}
