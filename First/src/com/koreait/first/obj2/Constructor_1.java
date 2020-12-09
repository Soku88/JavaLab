package com.koreait.first.obj2;

public class Constructor_1 {

}
class Con1 extends Constructor_1 {
	//member
	private int age;
	private String name;
	private int a;
	private int b;
	private String address;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	//getter setter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Con2 extends Con1 {
	//생성자
	public Con2() {}
	public Con2(String name, int age) {
		setName(name);
		setAge(age);
		getAddress();
		print();
	}
	public int Con3(int a, int b) {
		setA(a);
		setB(b);
		return a + b;
	}
	
	//기능
	public void print() {
		System.out.printf("저는 %s이고 나이는 %d살 입니다.\n",getName(),getAge());
	}
}
