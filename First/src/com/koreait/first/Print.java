package com.koreait.first;

public class Print {

	public static void main(String[] args) {
		
		System.out.println("안녕"); //println : 개행 \n
		System.out.println("안녕");
		System.out.println("---------------");
		System.out.print("Hello\n"); //개행시 이케이프문자 \n 
		System.out.print("Hello\n");
		System.out.println("---------------");
		
		String name = "홍길동";
		int age = 22;
		float height = 176.4f;
		double weight = 60.2;
		char bloodType = 'A';
		
		System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + age + "살 이고, 키는 " 
		+ height + "cm이고, 몸무게는 " + weight +"kg 이고, 혈액형은 " + bloodType + "형 입니다.");
		
		System.out.printf("내 이름은 %s입니다. 제 나이는 %d살 이고, 키는 %.2fcm이고, 몸무게는 %.2fkg이고,"
				+ "혈액형은 %c형 입니다. \n", name, age, height, weight, bloodType);
		
		
		System.out.printf("%c : %d\n", bloodType, (int)bloodType);
		System.out.printf("%c : %d\n", (char)66, 66);
		
		int y = 2020;
		int m = 1;
		int d = 4;
		
		String format = String.format("%d%02d%02d", y,m,d);
		System.out.println(format);
		
	}

}
