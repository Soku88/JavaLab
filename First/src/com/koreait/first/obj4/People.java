package com.koreait.first.obj4;


public class People {
	
	public void printInfo() {
		System.out.println("나는 사람입니다.");
	}
	public void enlist() {}
	public void makeUp() {}
}

class Man extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 나는 남자입니다.");
	}
	@Override
	public void enlist() {
		System.out.println("내일 군대를 갑니다.");
		System.out.println("충성!");
	}
}
class Woman extends People {
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("그리고 나는 여자입니다.");
	}
	@Override
	public void makeUp() {
        System.out.println("예뻐질 거랍니다.");
        System.out.println("톡톡 촵촵!");
	 }
}
