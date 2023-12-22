package org.son.day01.operator;

public class Exam_Unary {
	public static void main(String [] args) {
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		// 후위연산, 전위연산
		int a1 = 1;
		System.out.println(++a1);
		System.out.println(a1++);
		System.out.println(a1);
		// 문제 1
		int a =10;
		int b =20;
		int c =30;
		// a가 10, b는 20, c는 30
		a++;
		// a : 11, b :20, c : 30
		b = (-a) + b;
		// a : 10, b = 30, c :30
		c = (a++) + (--b);
		// a : 11, b : 29, c : 39
		System.out.println("a :"+a+",b:"+b+",c:"+c);
		// 문제2
		int x = 100;
		int y = 33;
		int z= 0;
		// x는 100, y는 33, z는 0
		 x--;
		// x :99, y : 33, z:0
		z = x-- + --y;
		// x : 98, y : 32, z :131
		x = 99 + x++ + x; //99 + 98 +99
		// x : 296, y :32, z :131
		y = y-- + y + ++y; //32 + 31 + 32
		// x :296 y :95 c: 131
		System.out.println("x :" + x + ",y :"+y+",z:"+z);
	}
}
