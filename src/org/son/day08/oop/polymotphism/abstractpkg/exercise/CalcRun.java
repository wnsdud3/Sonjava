package org.son.day08.oop.polymotphism.abstractpkg.exercise;

public class CalcRun {
	
	public static void main(String[] args) {
		CherryCalc calc = new CherryCalc();
		System.out.println("합 :" + calc.add(11,13));
		System.out.println("차 :" + calc.substract(4,25));
		int [] a = {23,11,13,4,25};
		System.out.printf("평균 : %.2f\n", calc.average(a));
	}

}
