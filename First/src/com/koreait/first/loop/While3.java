package com.koreait.first.loop;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int val = 0;
		
		do 
		{			
		System.out.print("숫자를 입력하세요 (종료 : 0) : ");
		val = sc.nextInt();
		result += val;
		}
		while(val != 0);
			System.out.println("합계 : "+result);
			sc.close();
	}

}
