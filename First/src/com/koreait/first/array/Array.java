package com.koreait.first.array;

public class Array {

	public static void main(String[] args) {
		
		//변수 리터럴 (값만 가지고 있는 변수)
		int n1 = 100;
		System.out.println(n1);
		
		//Array[]
		//기능을 가지고 있다
		int[] intArr = new int[100]; //정수형 배열 생성
		intArr[0] = 100;
//		intArr.length = 200; .length : 상수
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println("intArr.length : " + intArr.length);
		
		float[] floatArr = new float[10]; //실수형 배열
		
		floatArr[0] = 10.1f;
		System.out.println(floatArr[0]);
		System.out.println(floatArr[1]);
		
		String[] strArr = new String[10]; 
		System.out.println(strArr[0]);
		
		String str = "안녕";
		
	}

}
