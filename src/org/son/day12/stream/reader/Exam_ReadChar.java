package org.son.day12.stream.reader;

import java.io.FileReader;
import java.io.Reader;

public class Exam_ReadChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		
		try {
			reader = new FileReader("src/org/son/day12/stream/reader/reading.txt");
			char [] cBuf = new char[3];
			String result = "";
			int readCharCount;
			while(true) {
				readCharCount = reader.read(cBuf);
				if(readCharCount == -1) break;
				result += new String(cBuf, 0, readCharCount);
			}
			
		} catch (Exception e) {
			
		}
	}

}
