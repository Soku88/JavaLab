package com.koreait.first;

public class StringTest {

	public static void main(String[] args) {
		//Instance (객체화)
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		String s3 = s2;
		
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s2));
		System.out.println("안녕".equals(s1));
		System.out.println("안녕".equals(s2)); //문자열의 값 비교는 .equals Method사용
		
	}

}
