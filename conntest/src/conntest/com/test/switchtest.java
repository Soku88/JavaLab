package conntest.com.test;

import java.util.Scanner;

public class switchtest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계절을 입력하세요 : ");

		String month = sc.next();

		switch (month) {
		case "봄":
			System.out.println("꽃이 피었습니다.");
			break;
		case "여름":
			System.out.println("바다에 갑니다.");
			break;
		case "가을":
			System.out.println("하늘이 높습니다.");
			break;
		case "겨울":
			System.out.println("눈사람을 만들어요");
			break;
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}

	}

}
