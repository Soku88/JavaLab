package com.koreait.first.Method;

public class Method2 {

	public static void main(String[] args) {
		int r = sum(1, 2);
		
		System.out.println("r : " + r);
	}
	
	public static int sum(int n1, int n2) {
		int sum = n1 + n2;
		return sum; //비void형은 return값이 필수, tpye이 일치 해야한다.
					//void형에 비해 유연하다, 재활용성이 높음
	}

}
