package com.first.spring;

public class AppleSpeaker implements Speaker {
	private int maxSoundPower;
	private int currentSoundPower;
	
	public AppleSpeaker() {
		maxSoundPower = 15;
		System.out.println("-----Apple Speaker");
	}
	
	public void soundPowerUp() {
		currentSoundPower++;
	}
	
	public void soundPowerDown() {
		currentSoundPower--;
	}

}
