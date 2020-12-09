package com.koreait.first.control;

public class If {

	public static void main(String[] args) {
		//분기문, 조건문
		//알고리즘 : 문제를 해결하기 위한 방법
		
		int n1 = 10;
		int n2 = 20;
		
		//같냐 다르냐
		System.out.println("n1 == n2 : " + (n1 == n2)); // == : 값이 같냐
		System.out.println("n1 != n2 : " + (n1 != n2)); // != : 값이 같지않냐
		System.out.println();
		//크냐 작냐
		System.out.println("n1 > n2 :" + (n1 > n2)); // 크냐 작냐
		System.out.println("n1 >= n2 :" + (n1 >= n2)); // >= 같거냐 크냐
		System.out.println("n1 < n2 :" + (n1 < n2)); // < 크냐 작냐
		System.out.println("n1 <= n2 :" + (n1 <= n2)); // <= 같거냐 크냐
		System.out.println();

		
		if(true)
		{
			System.out.println("안녕");
		}
		System.out.println("하세요");
	}	

}
