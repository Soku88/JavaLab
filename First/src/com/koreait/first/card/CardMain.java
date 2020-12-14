package com.koreait.first.card;

import java.util.Arrays;

public class CardMain {
	public static void main(String[] args) {
		String[] shape_list = { "spade", "heart", "clover", "diamond" };
		String[] number_list = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		int cnt = 0; // 복사된 값을 담아줄 변수
		// 52개의 카드객체를 담을수 있는 배열생성
		// 52개의 서로 다른 값을 가지고 있는 카드 객체를 모두 담아라
	
		
		// 배열 공간생성 (shape * number)
		Card[] card = new Card[shape_list.length * number_list.length];
		for (int i = 0; i < shape_list.length; i++) {
			for (int j = 0; j < number_list.length; j++) {
				card[cnt++] = new Card(shape_list[i], number_list[j]); //card[]배열 주소에 배열값을 받아와서 더해줌
			}
		}

		for (int i = 0; i < card.length; i++) {
			System.out.println(card[i]);
		}

	}

}
