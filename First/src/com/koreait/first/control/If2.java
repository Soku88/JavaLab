package com.koreait.first.control;

public class If2 {

	public static void main(String[] args) {
		
		int num = -9;
		
		//num 값이 10 이상이면 "num은 10 이상입니다."
		//10미만이면 "num은 10 미만입니다."
		
		if(num >= 10) //if & else (Group : 값에 따라 둘중 하나가 실행된다)
		{
			System.out.println("num은 10 이상입니다.");
		} else {
			System.out.println("num은 10 미만입니다.");
		}
		
		
	}

}
