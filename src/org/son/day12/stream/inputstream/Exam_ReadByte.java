package org.son.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Exam_ReadByte {
	public static void main(String[] args) {
		InputStream is = null;
		String result = "";
		try {
			is = new FileInputStream("src/org/son/day12/stream/inputstream/reading.txt");
			int readByteCount;
			byte[] readBytes = new byte[3];
			readByteCount = is.read(readBytes);
			// 바이트 배열과 갯수를 넘겨주면 문자열로 만들어주는
			// String생성자를 통해 문자열로 만들어줌
			result += new String(readBytes, 0, readByteCount);

			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
