package com.koreait.first.starCraft;

public abstract class AttackUint extends Unit {
	protected final int ATK_POINT;

	public AttackUint(int hp, int ATK_POINT) {
		super(hp);
		this.ATK_POINT = ATK_POINT;
	}

	public void attack(Unit unit) {
		unit.hp -= ATK_POINT;
	}

}
