package com.koreait.first.abst;

public class AbstractTest { //추상메서드

	public static void main(String[] args) {
		
//		AbstA aa = new AbstA(); abstract 선언 > 객체화 x 부모타입으로서의 역할만 수행
		AbstA aa = new AbstB(); 
		aa.bark();
		AbstB ab = (AbstB)aa; //shakeTail()을 알고있는 AbstB로 강제형변환
		ab.shakeTail();
		
		((AbstB)aa).shakeTail();
	}

}
