package com.koreait.first;

public class AndOr {

	public static void main(String[] args) {
		
		//&&연산자 : 모든 값이 true인 경우 true, 하나라도 false인 경우에는 false return
		//Tips : false가 날 가능성이 높은 코드를 앞쪽으로 배치
		boolean r1 = false && true && true;
		System.out.println("r1 : " + r1);
		
		boolean r2 = true && true && false;
		System.out.println("r2 : " + r2);
		
		
		//||연산자 : 한가지 값만 true라도 true, 모든값이 false인 경우 false return
		//Tips : True의 가능성이 가장 높은 코드를 앞쪽으로 배치
		boolean r3 = true || false || false;
		System.out.println("r3 : " + r3);
		
		boolean r4 = false || false || false;
		System.out.println("r4 : " + r4);
	}

}
