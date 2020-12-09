package com.koreait.first.inter;

//구현부가 있는 메소드는 생성불가능
//선언부가 있는 추상메서드만 생성가능
//구현부가 없기 때문에 객체화 x (나를 상속해라)
//강제성을 가지고 있다.

public interface InterChild extends InterParent {
	void bark();
}
