package com.koreait.first.card;

//모양 shape (spade, heart, clover, diamond)
//번호 value (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
public class Card {
	private final String SHAPE;
	private final String VALUE;

	private String[] shapes = { "spade", "heart", "clover", "diamond" };
	Card[] cardList = new Card[52];
	int idx = 0;

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

	public void allCard() {
		for (String shape : shapes) {
			for (int z = 1; z <= 13; z++) {
				String val;
				switch (z) {
				case 1:
					val = "A";
					break;
				case 11:
					val = "J";
					break;
				case 12:
					val = "Q";
					break;
				case 13:
					val = "K";
					break;
				default:
					val = String.valueOf(z);
				}
				cardList[idx++] = new Card(shape, val);
			}
		}
	}

	@Override
	public String toString() {
		return SHAPE + " " + "(" + VALUE + ")";
	}

}
