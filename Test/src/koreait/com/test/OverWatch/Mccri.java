package koreait.com.test.OverWatch;

public class Mccri implements OverWatch {
	
	public Mccri() {
		R_Click();
		Shift_Click();
		q_btn();
		e_btn();
		faceMccri();
	}

	@Override
	public void R_Click() {
		System.out.println("피스키퍼");
	}

	@Override
	public void Shift_Click() {
		System.out.println("구르기");
	}

	@Override
	public void q_btn() {
		System.out.println("황야의 무법자 : 궁극기");
	}

	@Override
	public void e_btn() {
		System.out.println("섬광탄");
	}
	
	public void faceMccri() {
		System.out.println("사막에서 총쏘는 듯하게 생겼다.");
	}

}
