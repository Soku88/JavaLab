package com.koreait.first.obj3;

//[다형성] 
//1. super()는 sub()를 참조할 수 있다.(자식객체의 주소값 저장할 수 있다.) DownCasting
//2. sub()는 super()를 가리킬 수 없다.(부모객체 주소값 저장 x)
//3. type은 메소드의 호출가능 여부만 결정(자기가 알고있는 메소드만 호출가능) 
//실제로 실행되는 메소드는 객체기준이다.

public class OverrideTest2 {

	public static void main(String[] args) {
		
		ClassA ca = new ClassB("A",10);
//		ClassB cb = new ClassA("B",20); 
		ca.print(); // 객체기준의 메소드를 호출 하기때문에 ClassB() 호출
//		ca.drive();
		ClassB cb = (ClassB)ca; 
		cb.drive();
		
	}

}
