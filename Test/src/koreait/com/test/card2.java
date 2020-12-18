package koreait.com.test;

public class card2 {

	public static void main(String[] args) {
		String[] shape = { "clover", "heart", "diamond", "spade" };
		String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int cnt = 0;

		// 배열공간 생성
		Card[] card = new Card[shape.length * number.length];

		// 값 입력
		for (int i = 0; i < shape.length; i++) {
			for (int j = 0; j < number.length; j++) {
				card[cnt++] = new Card(shape[i], number[j]); // shape, number값을 card[cnt++]에 입력
			}
		}
		// 출력
		for (int i = 0; i < card.length; i++) {
			System.out.println(card[i]);
		}

		System.out.println(card.length);
	}

}
