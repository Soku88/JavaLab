package koreait.com.test;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("계절을 입력해주세요 (봄,여름,가을,겨울) : ");
		String str = sc.next();

		switch (str) {
		case "봄":
			System.out.println("꽃이 피었습니다.");
			break;
		case "여름":
			System.out.println("바다에 갑시다.");
			break;
		case "가을":
			System.out.println("단풍구경 갑시다.");
			break;
		case "겨울":
			System.out.println("눈싸움 해요");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}

	}

}
