package com.koreait.first.obj;

public class StaticTest2 {

	public static void main(String[] args) {
		//n1 = 22, n2 = 55;
		
		InstCalc ic = new InstCalc(); //Instance(객체화, 주소값 할당)
		ic.n1 = 22; //객체화된 주소 ic로 접근하여 n1, n2값 부여
		ic.n2 = 55;
		System.out.println("ic sum : " + ic.sum());
		
		//static 메소드를 활용하여 계산
		System.out.println("static sum : " + StatCalc.sum(22, 55));
	}

}

class StatCalc {
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}

class InstCalc {
	int n1;
	int n2;
	int sum() {
		return n1 + n2;
	}
}
