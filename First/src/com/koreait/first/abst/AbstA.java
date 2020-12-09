package com.koreait.first.abst;

//추상메서드가 하나라도 있다면 클래스에도 abstract 선언
//추상메서드 : abstract를 무조건 붙여준다 > 메서드의 선언부로만 생성
//추상클래스는 객체화 할 수 없다. (구현부가 없는 메서드이기 때문)
//상속에 대한 강제성을 가진다.
public abstract class AbstA { 	
	public abstract void bark(); 					  	 
		public void print() {
		System.out.println("HI i'm A");
	}
}
