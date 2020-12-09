package com.koreait.first.Method;

import java.io.StringReader;

public class MethodGugudan {

	public static void main(String[] args) {
		gugudan(5);
		gugudan(3,5);

		System.out.println();
		System.out.println(strGugudan(3));
	}
	
	private static void gugudan(int z) {
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", z, i, z*i);
		}
	}

	public static String strGugudan(int n) {
		String result = "";
		for(int i=1; i<=9; i++) {
			result += String.format("%d * %d = %d\n", n, i, n*i);
		}
		return result;
	}
	
	public static void gugudan(int sNum, int eNum) {
		for(int i=sNum; i<=eNum; i++) {
			gugudan(i);
			System.out.println("----------------");
		}
	}

}

