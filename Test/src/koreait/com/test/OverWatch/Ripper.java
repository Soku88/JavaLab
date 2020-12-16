package koreait.com.test.OverWatch;

public class Ripper implements OverWatch {

	public Ripper() {
		R_Click();
		Shift_Click();
		q_btn();
		e_btn();
		faceRipper();
	}

	@Override
	public void R_Click() {
		System.out.println("샷건을 쏜다");
	}

	@Override
	public void Shift_Click() {
		System.out.println("망령화");
	}

	@Override
	public void q_btn() {
		System.out.println("죽음의 꽃 : 망령화");
	}

	@Override
	public void e_btn() {
		System.out.println("그림자 밟기");
	}
	
	public void faceRipper() {
		System.out.println("나는 유령이다.");
	}

}
