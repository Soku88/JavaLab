package koreait.com.test.OverWatch;

import java.util.Scanner;

public class OverWatchMain {

	public static void main(String[] args) {

		OverWatch over;
		Scanner sc = new Scanner(System.in);
		System.out.print("캐릭터를 선택해 주세요 (1.ripper 2.mei 3.Mccri) : ");
		int getChar = sc.nextInt();
		

		if (getChar == 1) {
			over = new Ripper();
		} else if (getChar == 2) {
			over = new Mei();
		} else {
			over = new Mccri();
		}
		
//		OverWatch ov1 = new Ripper();
//		OverWatch ov2 = new Mei();
//		OverWatch ov3 = new Mccri();
//		getInfo(ov1);
//		getInfo(ov2);
//		getInfo(ov3);

	}

	public static void getInfo(OverWatch ov) {
		ov.e_btn();
		ov.q_btn();
		ov.R_Click();
		ov.Shift_Click();
	}
}
