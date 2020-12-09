package com.koreait.first.obj2;
//접근지시어 : private, default, protected, public

//private : class 같은 클래스 내에서만 접근가능
//default : class, package 같은 클래스, 패키지 내에서 접근가능
//protected : class, package, 상속관계
//public : All

public class Animal2 {
	private String name; //Member field의 값이 바뀌는것을 막기위해 private사용
	private int age;	 //Test의 범위를 줄이기 위해서 사용, 상수는 non private
	
	//member field에 I/O : getter(), setter() method사용
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	public void getSet(String name, int age) {
		getName();
		getAge();
	}
	
	
	public void crying() {
		System.out.printf("%d살의 %s가 운다\n", age, name);
	}
}
