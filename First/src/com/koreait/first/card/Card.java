package com.koreait.first.card;

//모양 shape (spade, heart, clover, diamond)
//번호 value (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
public class Card {
	private final String SHAPE;
	private final String VALUE;

	public Card(String shape, String value) {
		this.SHAPE = shape;
		this.VALUE = value;
	}

	public String getValue() {
		return VALUE;
	}

	public String getShape() {
		return SHAPE;
	}

	@Override
	public String toString() {
		return SHAPE + " " + "(" + VALUE + ")";
	}

}
