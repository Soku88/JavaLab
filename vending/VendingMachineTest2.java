package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nmArr = {"Cola", "Cider", "Fanta", "Sol"};
		int[] priceArr = {500, 600, 700, 800};
		
		System.out.println("--메뉴--");
		for(int i=0; i < nmArr.length; i++) {
			System.out.printf("%d. %s - (%,d원)\n", i+1, nmArr[i], priceArr[i]);
		}
		int total = 0;
		while(true) {
			System.out.printf("메뉴 입력 (1~4, 종료 : 0) : ");
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



