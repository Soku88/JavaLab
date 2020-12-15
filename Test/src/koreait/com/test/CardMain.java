package koreait.com.test;

public class CardMain {

	public static void main(String[] args) {
		String[] shape = { "spade", "heart", "clover", "diamond" };
		String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int cnt = 0;

		// 배열공간 생성
		Card[] card = new Card[shape.length * number.length]; // shape (4) * number(13)크기만큼 공간생성

		// 값 대입
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < number.length; j++) {
				card[cnt++] = new Card(shape[i], number[j]);
			}
		}

		// 출력
		for (int i = 0; i < card.length; i++) {
			System.out.println(card[i]);
		}

	}

}
