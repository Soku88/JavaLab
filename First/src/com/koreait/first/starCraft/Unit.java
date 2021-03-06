package com.koreait.first.starCraft;

public abstract class Unit {
	protected final int MAX_HP;
	protected int hp;
	private int x; // 위치값
	private int y; // 위치값

	public Unit(int hp) {
		this.MAX_HP = hp;
		this.hp = hp;
	}

	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void whereIam() {
		System.out.printf("나는 %d, %y에 있다.\n", x, y);
	}

	public void showMyHp() {
		System.out.printf("hp : %d\n", hp);
	}
}
