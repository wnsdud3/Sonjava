package org.son.day12.stream.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Exam_WriteByte {
	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("");
			byte [] data = "한번 더 입출력".getBytes();
			os.write(data);
			os.flush(); // 버퍼비우기
			os.close();
			System.out.println("파일 쓰기 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
