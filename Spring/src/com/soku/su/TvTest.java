package com.soku.su;

public class TvTest {
	public static void main(String[] args) {

		Tv tv = Factory.makeTv(args[0]);
		tv.setSpeaker(Factory.makeSpeaker(args[1]));

		for (int i = 0; i < 100; i++) {
			tv.volUp();
		}
		System.out.println(tv);

		for (int i = 0; i < 5; i++) {
			tv.volDown();
		}
		System.out.println(tv);
		
		for (int i= 0; i < 10; i++) {
			tv.volDown();
		}
		System.out.println(tv);

	}
}
