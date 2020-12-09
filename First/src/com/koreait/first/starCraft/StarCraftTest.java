package com.koreait.first.starCraft;

public class StarCraftTest {

	public static void main(String[] args) {
		AttackUint m1 = new Marine();
		AttackUint m2 = new Marine();
		AttackUint f1 = new FireBat();
		Medic md = new Medic();
		AttackUint scv = new SCV();

		m1.attack(m2);
		f1.attack(m2);
		m1.attack(scv);
		f1.attack(scv);

		System.out.println("마린");
		m2.showMyHp();
		System.out.println("SCV");
		scv.showMyHp();

		md.heal(m2);
		m2.showMyHp();
		md.heal(scv);
		scv.showMyHp();

	}

}
