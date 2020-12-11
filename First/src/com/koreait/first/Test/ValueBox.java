package com.koreait.first.Test;

public class ValueBox {
	private int value;

	ValueBox() {
	}

	ValueBox(int i) {
		this.value = i;
	}
	
	@Override
	public boolean equals(Object obj) {
		ValueBox vb = (ValueBox)obj; //obj(super)는 valuebox(sub)를 모르기때문에 타입을 바꿔준다
		return this.value == vb.value;
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
