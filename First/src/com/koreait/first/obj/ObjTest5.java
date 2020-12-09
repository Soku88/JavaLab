package com.koreait.first.obj;

public class ObjTest5 {

	public static void main(String[] args) {
		//아래 NumberBox2를 객체화하며
		//a = 10, b = 20을 넣고
		//sum() 메소드를 호출하여 리턴하는 값을 콘솔에 출력
		
		NumberBox2 b2 = new NumberBox2(); //NumberBox2객체 주소값을 b2에 할당
		b2.a = 10;
		b2.b = 20;
		System.out.println(b2.sum());
		
		NumberBox2 bb2 = new NumberBox2();
		bb2.a = 33;
		bb2.b = 44;
		System.out.println(bb2.sum());
		
	}
}

class NumberBox2 {
	int a;
	int b;
	int sum() {
		return a + b;
	}

}
