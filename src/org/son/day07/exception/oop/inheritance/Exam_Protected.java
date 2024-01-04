package org.son.day07.exception.oop.inheritance;

import org.son.day07.exception.oop.point.Point;

class Super {
		public int pub;
		int def;
		protected int pro;
		private int pri;
	}
class Sub extends Super {
	private int childMoney;
	void set() {
		super.pub = 11;
		super.def = 13;
		super.pro = 4;
		// super.pri = 26;
	}
}
class ShapePoint extends Point {
	private String shape;
	void set() {
		super.pub = 11;
		// 같은 패키지가 아니기 때문에 불가능
		//super.def = 13;
		super.pro = 4;
		// 상속을 받은 클래스이기 떄문에 point의 pro 필드 접근가능
		// super.pri = 25;
	}
}

public class Exam_Protected {
	public static void main(String[] args) {
	}
}
