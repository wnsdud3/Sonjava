package org.son.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ImageCopy {
	public static void main(String[] args) {
		// c:\Windows\Web\Wallpaper\Theme1\img1.jpg를
		// c:\\Temp\\copyimg.jpg 복사해보세요
		InputStream is = null;
		try {
			is = new FileInputStream("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			byte [] tmdghksTm = new byte[1024];
			int c;
			while((c=is.read(tmdghksTm)) != -1) {
				
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
