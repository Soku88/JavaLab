package com.koreait.first.control;

import java.util.Scanner;

public class if4_2 {

	public static void main(String[] args) {
		
		//남자 평균키 : 165
		//여자 평균키 : 157
		//1. 성별을 입력해 주세요 : 
		//2. 키를 입력해 주세요 :
		//3. 당신은 평균 초과입니다. return
		//4. 당신은 평균 입니다.
		//4. 당신은 평균 미만입니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별을 입력해 주세요 : ");
		String gender = sc.next();
		
		System.out.print("키를 입력해 주세요 : ");
		int heigth = sc.nextInt();
		
		
		//MagicNumber에 변수지정
		//중복된 코드의 제거
		int avgHeight = 0;
		
		
		if("남자".equals(gender) || "남".equals(gender) || "man".equals(gender))
		{
			avgHeight = 165;			
		} else if ("여자".equals(gender) || "여".equals(gender) || "woman".equals(gender))
		{
			avgHeight = 157;			
		}
		
			if(heigth < avgHeight) {
				System.out.println("당신은 평균미만입니다.");
			} else if(heigth > avgHeight) {
				System.out.println("당신은 평균초과입니다.");
			} else {
				System.out.println("당신은 평균입니다.");
			}
		
		sc.close();
	}
	
}

