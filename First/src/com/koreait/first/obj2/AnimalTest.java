package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani_1 = new Animal(); // () 기본생성자 : default Constructor > 생성자가 하나도 없을때 JVM이 추가 
		ani_1.crying();
		
		Animal ani_2 = new Animal("navi", 3);
		ani_2.crying();
		
		Animal ani_3 = new Animal("달미");
		ani_3.crying();
	
		Animal ani_4 = new Animal(4);
		ani_4.crying();
		
		
	}

}
