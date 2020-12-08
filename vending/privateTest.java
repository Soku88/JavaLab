package com.koreait.first.vending;

public class privateTest {

	public static void main(String[] args) {
		privateTest2 pT2 = new privateTest2(); // pT2에 privateTest2 주소값 생성
		pT2.setName("mee"); //pT2.로 privateTest2의 멤버에 접근가능
		pT2.setAge(30);
		
		System.out.println(pT2.getName());
		System.out.println(pT2.getAge());
		System.out.println(pT2.getClass().getTypeName());		
		
	}

}
