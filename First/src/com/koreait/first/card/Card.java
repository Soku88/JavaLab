package com.koreait.first.card;

//모양 shape (spade, heart, clover, diamond)
//번호 value (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
public class Card {
	private int[] arr = new int[0];
	private final String SHAPE;
	private final String VALUE;

	private String[][] card = { { "spade", "heart", "clover", "diamond" },
			{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" } };

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

	public void saveCard(String shape, String value) {
		String[] cd = new String[arr.length]; // 배열 공간 생성
		for (int i = 0; i < card.length; i++) {

			for (int j = 0; j < num.length; j++) {
				System.out.println(cd[arr.length] = value);

			}
		}
	}
//	for(int i=1; i<=9; i++)
//	{
//		for(int z=2; z<=9; z++)
//		{
//			System.out.printf("%d * %d = %d\t",z,i,(z*i));
//		}
//		System.out.println();
//	}

	@Override
	public String toString() {
		return SHAPE + " " + "(" + VALUE + ")";
	}

}
