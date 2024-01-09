package org.son.day12.stream.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Exam_WriteByteOff {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/son/day12/stream/outputstream/writing.txt");
		} catch (Exception e) {
			
		}
	}
	
}
