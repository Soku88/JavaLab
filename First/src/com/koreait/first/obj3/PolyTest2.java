package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {
		ClassB cb = new ClassB(null,0);	
		ClassA ca = (ClassA)cb; // 현재 타입 ca > cb : UpCasting sup class의 주소값 참조가능
//		ClassC cc = (ClassC)cb; // 현재 타입 cc > cb : 자식은 부모를 가리킬수 없다.
		
		ClassB cb2 = (ClassB)ca; // 현재 타입 cb2 > ca 강제형변환 : 가리켜도 괜찮아.
		
		System.out.println(ca.equals(cb)); // 같은 주소를 가지고 있다.
		System.out.println(cb2.equals(ca));
		
		ca.print(); // 객체기준으로 사용된다.
		cb.print();
		
		
	}

}
