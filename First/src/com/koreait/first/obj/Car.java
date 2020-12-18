package com.koreait.first.obj;

public class Car { // Member field (값 저장담당, 명사로 명명)
	String name;
	int cc;
	String color;

	public void drive() {
		System.out.printf("%s 색상의 %dcc의 %s차량이 달린다.\n", color, cc, name);
	}

}
