package com.koreait.first.obj4;

public class Animal {
	void crying() {
		System.out.println("운다");
	}
	void shakeTail() {}
}
class Dog extends Animal {
	@Override
	void crying() {
		System.out.println("멍멍");
	}
	@Override
	void shakeTail() {
		System.out.println("살랑살랑");
	}
}
class Cat extends Animal {
	@Override
	void crying() {
		System.out.println("야옹");
	}
}
class Bird extends Animal {
//	@Override
//	void crying() {
//		System.out.println("짹짹");
//	}
//	
	void flying() {
		System.out.println("훨훨 난다");
	}
}
class Fish extends Animal {

	@Override
	void crying() {
		System.out.println("뻐금뻐끔");
	}
	
}


