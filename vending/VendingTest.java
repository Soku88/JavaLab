package com.koreait.first.vending;

import java.util.Scanner;

public class VendingTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String[] menuArr = {"콜라", "사이다", "환타"};
		int[] priceArr = {500, 600, 700};
		
		
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%s. %d - (%,d원)\n", i+1, menuArr[i], priceArr[i]);
		}
		int total = 0; // 값저장 변수
		while(true) {
			System.out.printf("메뉴 입력 (종료 : 0) : ");
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			total += priceArr[menu - 1];
		}
		System.out.println(total);
		sc.close();
		
		
	}

}
