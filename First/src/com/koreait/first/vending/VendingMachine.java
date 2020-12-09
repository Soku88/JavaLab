package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachine {
	private Scanner sc; // Member field에는 선언만 해준다.
	private Can[] canArr;
	private int sum;
	private int myMoney;

	public VendingMachine() { // main에 init()메소드 전달
		init();
	}

	private void init() {
		String[] nmArr = { "콜라", "사이다", "환타", "솔의눈", "데자와" };
		int[] priceArr = { 500, 600, 700, 800, 900 };
		sc = new Scanner(System.in);

		canArr = new Can[nmArr.length]; // canArr에 새로운 주소값 생성

		for (int i = 0; i < canArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i]); // canArr[i] > nmArr, priceArr 생성해주는 반복문
		}
	}

	public void showMenus() { // Can의 주소값을 canArr이 이미 알고있으므로 참조가능
		System.out.println("----메뉴----");
		for (int i = 0; i < canArr.length; i++) {
			System.out.printf("%d. %s - (%,d원)\n", i + 1, canArr[i].getNm(), canArr[i].getPrice());
		}
	}
//	public void purchase() {
//		int menu = 0;
//		while(true) {
//			System.out.printf("메뉴 입력 (1~4, 종료 : 0) : ");
//			menu = sc.nextInt();		
//			if(menu == 0) { // break;
//				break;
//			}
//			if(menu > canArr.length || menu < 0) { // menu ~ priceArr.length까지
//				System.out.println("잘못 입력하셨습니다. 다시입력 해 주세요");	
//				continue; // menu ~ priceArr.length가 아니라면 계속진행
//			}
//			sum += canArr[menu - 1].getPrice();	
//			}
//		System.out.println(sum);
//		sc.close();
//		}

	// 메뉴 입력받는 메서드
	public void purchase() {
		int choiceMenu = 0;
		int buyMoney = myMoney;
		while (true) {
			System.out.print("메뉴 입력 (종료 : 0) : ");
			choiceMenu = sc.nextInt();
			buyMoney -= sum;

			if (buyMoney < sum || buyMoney == 0) {
				System.out.println("잔액이 부족합니다.");
				break;
			}
			if (choiceMenu == 0) {
				break;
			} else if (choiceMenu > canArr.length || choiceMenu < 0) {
				System.out.println("잘못 입력하셨습니다. 다시입력해 주세요");
			} else {
				sum += canArr[choiceMenu - 1].getPrice(); // canArr[menu-1] < 배열의 주소값 이므로
														  // int형(.getPrice)으로 sum연산
			}
		}
		sc.close(); // 자원정리
	}

	public void myMoney() {
		System.out.println("현재 소지 금액을 입력하세요 : ");
		myMoney = sc.nextInt();
		
	}
	public void showSum() {
		System.out.println("총 구매 금액 :" + sum);
	}
}
