package com.koreait.first.obj;

public class ObjTest6_1{

	public static void main(String[] args) {
		NumberBox3 b2 = new NumberBox3();
		b2.a = 20;
		b2.b = 30;
		System.out.println(b2.sum());
		
		NumberBox3 b3 = copyObj(b2);
		System.out.println(b3.sum());
		
		System.out.println(b2.sum()==b3.sum());
		System.out.println(b2.equals(b3));
		
	}
	public static NumberBox3 copyObj(NumberBox3 b2) {
		NumberBox3 obj = new NumberBox3();
		obj.a = b2.a;
		obj.b = b2.b;
		
		return obj;
		
	}

}
class NumberBox3 {
	int a;
	int b;
	int sum() {
		return a * b;
		
	}
}