package com.koreait.first.vending;

import java.util.Scanner;

// -- menu --
//1. cola  > price 500
//2. cider > price 600
//3. fanta > price 700
//4. sol > 800
//메뉴선택 (0 : 종료) > 1 
//메뉴선택 (0 : 종료) > 2
//메뉴선택 (0 : 종료) > 2
//메뉴선택 (0 : 종료) > 0
//총 구매금액 : 1700원

public class VendingMachineTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menuArr = {"콜라", "사이다", "환타", "솔의눈"};
		int[] priceArr = {500, 600, 700, 800};
		
		System.out.println("====메뉴====");
		for(int i=0; i<menuArr.length; i++) {
			System.out.printf("%d. %s - (%,d원)\n",i+1,menuArr[i],priceArr[i]);
		}
		int result = 0;
		while(true) {
			System.out.print("메뉴 입력(종료 : 0) : ");
			int menu = sc.nextInt();
			if(menu == 0) {
				break;				
			}
			result += priceArr[menu - 1];
		}
		System.out.println(result);
		sc.close();
	}
	

}

