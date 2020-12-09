package com.koreait.first.obj4;

public class PeopleMain {

	public static void main(String[] args) {
//		People people = new Man();
//		People people2 = new Woman();
		
//		people.printInfo();
//		((Man)people).enlist();
//		System.out.println();
//		people2.printInfo();
//		((Woman)people2).makeUp();
		
		People man = new Man();
		People woman = new Woman();
		func(man);
		System.out.println();
		func(woman);
	}
	public static void func(People people) {
		people.printInfo();
		people.makeUp();
		people.enlist();
	}
}

