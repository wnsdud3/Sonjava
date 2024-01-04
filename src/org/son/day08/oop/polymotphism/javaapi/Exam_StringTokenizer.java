package org.son.day08.oop.polymotphism.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=kit&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query,"&=");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
