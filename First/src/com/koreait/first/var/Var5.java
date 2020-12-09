package com.koreait.first.var;

public class Var5 {

	public static void main(String[] args) {
		//오버플로우(넘치다), 언더플로우 : 형변환시 주의점
		
		byte d1 = 127; // byte : -128 ~ 127 > 강제형변환시 -128~127순환
		System.out.println(d1);
		
		byte d2 = (byte)129; // -127
		System.out.println(d2);
		
		long d3 = 101010101011230001L;
		int d4 = (int)d3;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(d4);
	}

}
