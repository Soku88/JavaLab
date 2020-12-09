package com.koreait.first.obj2;

//1. 부모타입은 자식객체를 가리킬 수 있다.
//2. 자식객체는 부모객체를 가리킬 수 없다.

public class InheriTest3 {

	public static void main(String[] args) {
//		ClassD cD = new ClassD("조용필", 30);
//		cD.print();
		
//		ClassA cA = new ClassB();
//		ClassB cB = new ClassA();
		
		ClassC cA = new ClassD("김남길", 20);
		ClassD cD = (ClassD)cA; //DownCasting
		cD.ddd();
		
		
	}

}
