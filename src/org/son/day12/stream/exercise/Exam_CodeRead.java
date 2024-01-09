package org.son.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {
	public static void main(String[] args) {
		// Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요!
		Reader reader = null;
		
		try {
			reader = new FileReader("");
			int readCharCount;
			char [] cBuf = new char[1024];
			String result = "";
			while ((readCharCount = reader.read(cBuf)) != -1) {
				result += new String(cBuf, 0, readCharCount);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
