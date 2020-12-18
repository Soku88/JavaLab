package com.koreait.first.obj;

public class StaticTest1 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.countury = "Korea";
		tv1.brand = "Samsung";
		tv1.inch = 50;
		tv1.printMe();

		Tv tv2 = new Tv();
		tv2.countury = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;

		Tv.countury = "France"; // Class Name.static으로 접근한다. (class변수)
		tv2.printMe();
		tv1.printMe();
	}
}

class Tv {
	static String countury; // static은 메서드와, 멤버필드에 1개만 할당가능
	String brand;
	int inch;

	void printMe() { // method에 static을 붙이면 안되는 경우...
						// static이 없는 멤버필드를 메소드에서 사용하게되면 사용불가
		System.out.printf("%s 나라의 %s회사의 %d인치 Tv입니다.\n", countury, brand, inch);
	}

	// 사용가능
	static String whereCountury() {
		return countury;
	}

	static int sum(int i, int z) {
		return i + z;
	}

}