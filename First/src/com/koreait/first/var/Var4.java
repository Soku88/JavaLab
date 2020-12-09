package com.koreait.first.var;

public class Var4 {

	public static void main(String[] args) {
		
		//변수간의 연산가능 (자료형의 type이 일치해야 한다.)
		int n1 = (int)10; //자동형변환, Literal(리터럴 : 10, 20, 10.1...)
		int n2 = 20;
		int n3 = n1 + n2;
		
		System.out.println(n3);
		
		float f1 = 10.1f;
		double f2 = 10.1;
		
		int n4 = (int)f2; //강제형변환 : 값의 손실이 있을 수 있음.
		System.out.println(n4);
		
		//--------------------------------------------------
		
		System.out.println("----------------------");
		
		int num1 = 10;
		int num2 = 3;
		
		float num3 = (float)num1/num2;
		System.out.printf("%04.4f",num3);

	}

}
