package com.koreait.first.vending;

public class VendingMachineTest4 {

	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();	//객체생성
		vm.myMoney();	 //객체기능 호출
		vm.showMenus();	 //메서드의 재사용성을 높이기위해 한가지 기능만 부여하는것이 좋다.
		vm.purchase();
		vm.showSum();
	
	}
	

}

