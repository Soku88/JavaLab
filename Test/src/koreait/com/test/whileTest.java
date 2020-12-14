package koreait.com.test;

import java.util.Scanner;

public class whileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 (종료 : 0) : ");

		int val = sc.nextInt();
		int result = 0;

		while (val != 0) {
			result += val;
			System.out.println("숫자를 입력하세요 (종료 : 0) : ");
			val = sc.nextInt();
		}
		System.out.println("합계 : " + result);
		sc.close();

	}

}
