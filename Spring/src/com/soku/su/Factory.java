package com.soku.su;

public class Factory {
	
	public static Tv makeTv(String name) {
		switch (name) {
		case "lg":
			return new LgTV();
		case "samsung":
			return new SamsungTV();

		}
		return null;
	}

	public static Speaker makeSpeaker(String name) {
		switch (name) {
		case "boss":
			return new BossSpeaker();
		case "apple":
			return new AppleSpeaker();
		}
		return null;
	}

}
