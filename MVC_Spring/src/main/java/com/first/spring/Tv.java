package com.first.spring;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class Tv {
	private int maxCh;
	private int maxVol;

	private int currentCh;
	private int currentVol;

	@Autowired
	private Speaker speaker;

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public Tv(int maxCh, int maxVol, Speaker speaker) {
		this.maxCh = maxCh;
		this.maxVol = maxVol;
		this.speaker = speaker;
	}

	public Tv(int maxCh, int maxVol) {
		this.maxCh = maxCh;
		this.maxVol = maxVol;
	}

	public void volUp() {
		if (currentVol < maxVol) {
			currentVol++;
			speaker.soundPowerUp();
		}

	}

	public void volDown() {
		if (currentVol > 0) {
			currentVol--;
			speaker.soundPowerDown();
		}

	}

	@Override
	public String toString() {
		return String.format("volumn : %d", currentVol);
	}

}
