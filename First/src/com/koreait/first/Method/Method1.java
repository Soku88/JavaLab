package com.koreait.first.Method;

public class Method1 {

	public static void main(String[] args) {
		sum("값",1, 2);
		sum(10, 20, "값");
		
		
	}
	
	//Overloading > parameter와 연관o return type과는 연관xx
	public static void sum(String str, int n1, int n2)/*method선언부*/ {
		System.out.printf("%s : %d + %d = %d\n", str, n1, n2, n1 + n2);
	}/*method구현부*/
	
	public static void sum(int n1, int n2, String str)/*method선언부*/ {
		sum(str, n1, n2);
	}/*method구현부*/

}
