package com.first.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
		
		LgTV ltv = (LgTV)ctx.getBean("lg");
		ltv.volUp();
		ltv.volUp();
		ltv.volUp();
		System.out.println("ltv : " + ltv);
		
		SamsungTV stv = (SamsungTV)ctx.getBean("samsung");
		stv.volUp();
		stv.volUp();
		System.out.println("stv : " + stv);
	

	}
}
