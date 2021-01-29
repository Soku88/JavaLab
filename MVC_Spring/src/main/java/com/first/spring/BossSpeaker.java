package com.first.spring;


public class BossSpeaker implements Speaker {
	private int maxSoundPower;
	private int currentSoundPower;
	
	public BossSpeaker() {
		maxSoundPower = 10;
		System.out.println("-----Boss Speaker");
	}
	
	public void soundPowerUp() {
		currentSoundPower++;
	}
	public void soundPowerDown() {
		currentSoundPower--;
	}


}
