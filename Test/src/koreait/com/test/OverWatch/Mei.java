package koreait.com.test.OverWatch;

public class Mei implements OverWatch {
	
	public Mei() {
		R_Click();
		Shift_Click();
		q_btn();
		e_btn();
		faceMei();
	}

	@Override
	public void R_Click() {
		System.out.println("샷건을 쏜다.");
	}

	@Override
	public void Shift_Click() {
		System.out.println("급속빙결");
	}

	@Override
	public void q_btn() {
		System.out.println("눈보라 : 궁극기");
	}

	@Override
	public void e_btn() {
		System.out.println("빙벽");
	}
	
	public void faceMei() {
		System.out.println("안경 쓴 여자이다.");
	}
	
	

}
