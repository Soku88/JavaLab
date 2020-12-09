package com.koreait.first.abst;

//추상클래스(abstract)는 일반클래스보다 조금더 추상적은 개념의 것을 정의한다.
//추상클래스(abstract)의 추상 메서드와 메서드, 멤버필드, 생성자를 정의 할 수 있지만, 추상메서드는 내용을 정의 할 수 없다.
//추상클래스(abstract)의 추상메서드를 정의하면 추상클래스를 상속받은 클래스에서는 반드시 추상메서드를 Override 하여 정의하여야 한다.
//추상클래스(abstract)는 abstract class [클래스명] 으로 정의한다.
//추상클래스(abstract)의 추상메서드는 [접근제한자] abstract [return 자료형] [메서드이름]() 으로 정의한다.
//추상클래스(abstract)는 extends 로 상속받는다. 
//추상클래스(abstract)는 다중 상속이 안된다.

public class AbstractTest {

	public static void main(String[] args) {
		
//		AbstA aa = new AbstA(); abstract 선언 > 객체화 x 부모타입으로서의 역할만 수행
		AbstA aa = new AbstB(); 
		aa.bark();
		AbstB ab = (AbstB)aa; //shakeTail()을 알고있는 AbstB로 강제형변환
		ab.shakeTail();
		
		((AbstB)aa).shakeTail();
		
		
	}

}
