package com.koreait.first.Static;

class Foo {
	public static String classVar = "I'm class var"; 
	public String instanceVar = "I'm instance var";
	
	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); 접근불가능
		
	}
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
	
}

public class StaticExam {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);  //Class를 통해서 접근가능 > static
		Foo.classMethod(); //클래스 소속(static)이기 때문에 클래스를 통해서 접근가능
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		f1.instanceMethod();
		System.out.println(f1.instanceVar); //instance(객체화)를 통해서 접근가능
		
		f1.classVar = "Changed by f1";  //f1객체는 classVar를 복제한것(같은주소 사용) 이기때문에
										//f1.에서 값을 바꾸면 모든값이 바뀐다.
		System.out.println(f2.classVar);
		System.out.println(f1.classVar); 
		
		System.out.println();
		f1.instanceVar = "Changed by f1";	//instanceVar는 class에 소속되어있지 않다.
		System.out.println(f1.instanceVar); //f1의 값을 바꿔도 f2에는 영향 x
		System.out.println(f2.instanceVar); //별개의 주소를 가지고 있음
		
	}

}
