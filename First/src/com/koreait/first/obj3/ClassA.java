package com.koreait.first.obj3;

public class ClassA {  // class 앞에 public이 올수있는건 파일명과 동일한 클래스뿐
	private String name;
	private int age;
	

	public ClassA() {} //Default Constructor 추가 or 인자값 전달
	public ClassA(String name, int age) {
//		System.out.println("Class A Constructor");	//생성자를 통해서 값을 넣을수 있다.
		this.name = name;				  			//getter,setter를 통해서 넣는다.
		this.age = age;
//		this.print(); //객체 기준의 this.
	}
	
	
	public void print() {
		System.out.println(name + " , " + age);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
