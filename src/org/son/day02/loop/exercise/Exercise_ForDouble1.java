package org.son.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		// 2 단을 세로로 출력, 그 옆에 3단 세로로 출력,
		// 그 옆에 4단 세로로 출력
		for(int j =1; j <10; j++) {
			for(int i = 2; i <10; i++) {
				System.out.print(i +"*j = "+i*j );
				System.out.print("\t");
			}	
			System.out.println();
		}
			
		}
}
