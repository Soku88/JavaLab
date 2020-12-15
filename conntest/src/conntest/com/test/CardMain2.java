package conntest.com.test;

public class CardMain2 {

	public static void main(String[] args) {
		String[] lan = {"java", "python", "JS", "C"};
		String[] val = {"2", "3", "4", "5"};
		int cnt = 0;
		
		Card[] card = new Card[lan.length * val.length];
		for(int i=0; i<lan.length; i++) {
			for(int j=0; j<val.length; j++) {
				card[cnt++] = new Card(lan[i], val[j]);
			}
		}
		
		for(int i=0; i<card.length; i++) {
			System.out.println(card[i]);
		}
		
		System.out.println(card.length);

	}

}
