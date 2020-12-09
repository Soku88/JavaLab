package com.koreait.first.obj2;

public class ClassA {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class ClassB extends ClassA {
	private int age;

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class ClassC extends ClassB {
	public ClassC() {}
	public ClassC(String name, int age) {
		setName(name);
		setAge(age);
	}
	public void print() {
		System.out.printf("저는 %s이고 나이는 %d살 입니다.\n",getName(),getAge());
	}
}
class ClassD extends ClassC {
	public ClassD() {}
	public ClassD(String name, int age) {
		super(name,age);
	}
	
	@Override //@annotation
	public void print() {
		System.out.printf("I'm %s, My age is %d\n", getName(),getAge());
	}
	
	public void ddd() {
		System.out.println("ddd");
	}
}



