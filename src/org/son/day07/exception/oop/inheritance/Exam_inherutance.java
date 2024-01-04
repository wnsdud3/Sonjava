package org.son.day07.exception.oop.inheritance;

import org.son.day07.exception.oop.point.ColorPoint;
import org.son.day07.exception.oop.point.Point;

public class Exam_inherutance {
	public void main(String[] args) {
		// (x,y)의 한점을 표현하는 point 클래스와 이를 상속받아
		// 색을 가진 점을 표현하는 colorpoint 클래스를 만들고 황ㄹ용해보자
		Point p = new Point(1,2);
		p.showPoint();
		ColorPoint cp = new ColorPoint(4, 26, "pulple");
		//cp.
		//cp.showPoint();
		//cp.showColorPoint();
		
	}

}
