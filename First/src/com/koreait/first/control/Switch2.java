package com.koreait.first.control;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = sc.next();
		
		int avgHeight = 0;
		
		if(avgHeight != 0)
		{
			System.out.print("키를 입력해 주세요 : ");
			int heigth = sc.nextInt();
			
			if(heigth < avgHeight) {
				System.out.println("당신은 평균미만입니다.");
			} else if(heigth > avgHeight) {
				System.out.println("당신은 평균초과입니다.");
			} else {
				System.out.println("당신은 평균입니다.");
			}
		}
		//MagicNumber에 변수지정
		//중복된 코드의 제거
		switch(gender)
		{
		case "남자":
		case "남":
		case "man":
			avgHeight = 166;
			break;
			
		case "여자":
		case "여":
		case "woman":
			avgHeight = 157;
			break;
		default:
			System.out.println("잘못 입력 되었습니다.");
			break;
		}
		
		sc.close();
	}
}

