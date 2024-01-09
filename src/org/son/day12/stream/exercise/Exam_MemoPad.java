package org.son.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {
	public static void main(String[] args) {
		// 저장할 파일 입력(확장자 제외) : snow.txt
		// 종료는 exit
		// 1 : 오늘은
		// 2 : 눈이
		// 3 : 옵니다.
		// 4 : 펑펑
		// 5 : 옵니다.
		// 6 : exit
		// 파일 저장이 완료되었습니다. F5를 눌러 확인해보세요~
		// snow.txt -> 오늘은 \n 눈이 \n 옵니다 \n 펑펑 \n옵니다
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일 입력(확장자 제외) : ");
		String fileName = sc.nextLine();
		String dest = "src/org/son/day12/stream/exercise/" + fileName + ".txt";
		Writer writer = null;

		try {
			writer = new FileWriter(dest);
			System.out.println("종료는 exit");
			for(int i = 1;; i++) {
				System.out.println(i + " : ");
				String input = sc.nextLine();
				if(input.equals("exit")) break;
				writer.write(input + "\n");
			}
			writer.flush();
			System.out.println("파일이 저장완료되었습니다, F5를 눌러 확인해보세요");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}	
