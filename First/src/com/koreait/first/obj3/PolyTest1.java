package com.koreait.first.obj3;

//[다형성] 
//1. super()는 sub()를 참조할 수 있다.(자식객체의 주소값 저장할 수 있다.) DownCasting
//2. sub()는 super()를 가리킬 수 없다.(부모객체 주소값 저장 x)
//3. type은 메소드의 호출가능 여부만 결정(자기가 알고있는 메소드만 호출가능) 
//실제로 실행되는 메소드는 객체기준이다.

public class PolyTest1 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B",20);
		ClassA ca = cb;
		ca.print(); 
		Object obj = ca; //UpCasting
		cb.drive();
		ClassA ca2 = (ClassA)obj; //DownCasting
		ca2.print();
		
		ClassB cb2 = (ClassB)ca2;
		cb2.print();
		cb2.drive();
		ca.print();
		
		
	}

}
