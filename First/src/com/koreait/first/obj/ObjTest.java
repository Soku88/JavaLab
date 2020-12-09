package com.koreait.first.obj;

public class ObjTest {

	public static void main(String[] args) {
		int mNum = 10;
		
		NumberBox nbx = new NumberBox(); //101호
		nbx.num = 10;
		
		changeVal(mNum);
		changeVal(nbx);
		
		System.out.println("mNum : " + mNum);
		System.out.println("nbx : " + nbx.num);
	}
	public static void changeVal(int num) {
		num = 20;
	}
	public static void changeVal(NumberBox pNbx) { // 101호
//		pNbx = new NumberBox(); //102호 방 배정
		pNbx.num = 30;
	}
}
class NumberBox {
	int num;
}
