package com.koreait.first.obj;

public class CarTest { //Method field (동사로 명명)

	public static void main(String[] args) {
		
		Car car1 = new Car(); //객체화 instance, 대문자로 시작하는 타입에는 주소값이 들어간다.
		car1.name = "페라리";
		car1.cc = 5000;
		car1.color = "붉은색";
		
		Car car2 = new Car();
		car2.name = "포르쉐";
		car2.cc = 3500;
		car2.color = "블랙";
		
		car1.drive();
		car2.drive();
		
		System.out.println(car1 == car2); //레퍼런스변수 간의 비교는 주소값의 비교
	}

}
