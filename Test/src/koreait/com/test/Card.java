package koreait.com.test;

public class Card {
	private final String SHAPE;
	private final String VALUE;

	public Card(String shape, String value) {
		this.SHAPE = shape;
		this.VALUE = value;
	}

	public String getSHAPE() {
		return SHAPE;
	}

	public String getVALUE() {
		return VALUE;
	}

	@Override //toString 재정의
	public String toString() {
		return SHAPE + VALUE;
	}
	

}
