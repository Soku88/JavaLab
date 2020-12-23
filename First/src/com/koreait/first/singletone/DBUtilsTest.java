package com.koreait.first.singletone;

public class DBUtilsTest {

	public static void main(String[] args) {
		DBUtils du1 = DBUtils.getInstance();

		DBUtils du2 = DBUtils.getInstance();

		System.out.println(du1 == du2);

		du1.hello();

	}

}
