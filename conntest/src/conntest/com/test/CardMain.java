package conntest.com.test;

import java.sql.Connection;

public class CardMain {

	public static void main(String[] args) {
		String[] shape = {"jay", "mee", "foo"};
		String[] number = {"1","2","3","4","5"};
		int cnt = 0;
		
		//shape * number 크기만큼 배열공간생성
		Card[] card = new Card[shape.length * number.length];
		
		for(int i=0; i<shape.length; i++) {
			for(int j=0; j<number.length; j++) {
				card[cnt++] = new Card(shape[i], number[j]);
			}
		}
		
		for(int i=0; i<card.length; i++) {
			System.out.println(card[i]);
		}
	}

}
