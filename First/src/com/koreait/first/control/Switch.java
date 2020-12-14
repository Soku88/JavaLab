package com.koreait.first.control;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		// break를 만날때 까지 모든 코드 실행
		int num = 4;

		switch (num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		default:
			System.out.println("1~4가 아닙니다.");

		}

		System.out.println("--------------------------");

		String season = "봄";
		switch (season) {
		case "봄":
			System.out.println("꽃이 피었습니다.");
			break;
		case "여름":
			System.out.println("물놀이 가요");
			break;
		case "가을":
			System.out.println("단풍구경 갑시다");
			break;
		case "겨울":
			System.out.println("눈싸움 해요");
			break;
		default:
		}
		System.out.println("--------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 입력해주세요 (봄,여름,가을,겨울) : ");
		String str = sc.nextLine();
		switch (str) {
		case "봄":
			System.out.println("봄입니다.");
			break;
		case "여름":
			System.out.println("여름입니다.");
			break;
		case "가을":
			System.out.println("가을입니다.");
			break;
		case "겨울":
			System.out.println("겨울입니다");
			break;
		default:
			System.out.println("잘못입력 하셨습니다. 다시 입력해주세요.");
			break;
		}	
		sc.close();
	}

}
