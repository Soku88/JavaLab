package com.koreait.first.singletone;


//객체가 무조건 1개만 생성되게끔 구조를 잡는다.
public class DBUtils {
	
	private static DBUtils du;
	
	//외부에서 접근이 불가능하도록 DBUtils로 default constructor생성
	private DBUtils() {}
	
	public static DBUtils getInstance() {
		if(du == null) {
			du = new DBUtils();
		}
		return du;
	}

	public void hello() {
		System.out.println("안녕");
	}
}
