package org.son.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {
	
	public static void main(String[] args) {
		// c:\\windows\\system.ini 을 복사해서
		// c:\\Temp\\system.txt 로 만들어주세요, 단 문자기반 스트림을 사용하세요
		Reader reader = null;
		Writer writer = null;
		String src = "";
		String dest = " "; 
				
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
