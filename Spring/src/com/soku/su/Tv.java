package com.soku.su;

public abstract class Tv {
	private int maxCh;
	private int maxVol;

	private int currentCh;
	private int currentVol;

	private Speaker speaker;

	public void setSpeaker(Speaker speaker) {
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
