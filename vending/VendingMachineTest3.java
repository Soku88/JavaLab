package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nmArr = { "콜라", "사이다", "환타", "솔의눈", "데자와", "제로콜라" };
		int[] priceArr = { 500, 600, 700, 800, 900, 1100 };

		showMenus(nmArr, priceArr);
//		getPrice(priceArr);

		int sum = purchase(priceArr, sc); // 1 ~ 5, 0 : 종료, 0 ~ 5 벗어난 값은 잘못입력
		System.out.printf("총 구매금액 : %,d원 \n", sum);
		sc.close();
	}

	public static void showMenus(String[] nmArr, int[] priceArr) {
		for (int i = 0; i < nmArr.length; i++) {
			System.out.printf("%d. %s - (%,d원)\n", i + 1, nmArr[i], priceArr[i]);
		}
	}

//public static void getPrice(int[] priceArr) {
//	int total = 0;
//	while(true) {
//		System.out.printf("메뉴 입력 (1~4, 종료 : 0) : ");
//		int menu = sc.nextInt();		
//		if(menu == 0) {
//			break;
//		}
//		total += priceArr[menu - 1];
//	}
//	System.out.println(total);
//	sc.close();	
//	
//	}
	

// 좋은 source란...
//1. 유지보수가 용이한 소스
//2. 가독성이 좋은 소스
//3. 퍼포먼스

public static int purchase(int[] priceArr, Scanner sc) {
	
	int menu = 0;
	int sum = 0;
	while(true) {
		System.out.printf("메뉴 입력 (1~4, 종료 : 0) : ");
		menu = sc.nextInt();		
		if(menu == 0) { // break;
			break;
		}
		if(menu > priceArr.length || menu < 0) { // menu ~ priceArr.length까지
			System.out.println("잘못 입력하셨습니다. 다시입력 해 주세요");	
			continue; // menu ~ priceArr.length가 아니라면 계속진행
		}
		sum += priceArr[menu - 1];		
	}
	return sum;
	}
}