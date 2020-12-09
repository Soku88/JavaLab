package com.koreait.first.obj2;
//Method와 Constructor의 다른점!!
//1. Method명이 class명과 동일해야한다.
//2. return type이 없어야한다.

public class Animal {
	//Member
	String name;
	int age;
	
	public Animal() { //default Constructor
		this("바둑이"); //this(생성자호출)
	}
	public Animal(String name) {
		this(name, 2);
	}
	public Animal(int age) {
		this("바둑이", age);
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age; // age = d < 변수명이 다를경우 this. 생략가능
	}
	public void crying() { //Method
		System.out.printf("%d살의 %s가 운다\n", age, name);
	}
	
	

}
