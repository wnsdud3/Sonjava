package org.son.day12.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) {
		// 문자 기반 스트림, Reader(입력 스트림)
		Reader reader = null;
		
		try {
			reader = new FileReader("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
