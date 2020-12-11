package com.koreait.first.card;

import java.util.Arrays;

public class CardMain {
	public static void main(String[] args) {
		// 52개의 카드객체를 담을수 있는 배열생성
		// 52개의 서로 다른 값을 가지고 있는 카드 객체를 모두 담아라
		String[] shapes = { "spade", "heart", "clover", "diamond" };

		Card[] cardList = new Card[52];
		int idx = 0;
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
				
				System.out.println(Arrays.toString(shapes));
				
			}
		}

	}

}
