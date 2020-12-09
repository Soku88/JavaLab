package com.koreait.first.obj2;
//접근지시어 : private, default, protected, public

//private : class 같은 클래스 내에서만 접근가능
//default : class, package 같은 클래스, 패키지 내에서 접근가능
//protected : class, package, 상속관계
//public : All

public class CapsuleTest {
	
	public static void main(String[] args) {
	Animal2 ani2 = new Animal2();
	ani2.setName("철철이");
	ani2.setAge(10);
	ani2.crying();
	
	String ani2Name = ani2.getName();
	int ani2Age = ani2.getAge();
	
	
	System.out.println(ani2Name);
	System.out.println(ani2Age);
	
	
	
	
	
//	ani2.name = "";
//	ani2.age = 2;
	

		
	}
}
