package com.koreait.first.obj2;

public class InheriTest {

	public static void main(String[] args) {
		ClassA cA = new ClassA();
		cA.setName("홍길동");
//		cA.getAge(); 불가능
//		cA.print(); 불가능
		
		ClassB cB = new ClassB();
		cB.setName("김남길");
		cB.setAge(10);
//		cB.print(); 불가능
		
		ClassC cC = new ClassC();
		cC.setName("장원석");
		cC.setAge(33);
		cC.print();
		
		ClassD cD = new ClassD("가나다",10);
		cD.print();
		
		
	}

}
