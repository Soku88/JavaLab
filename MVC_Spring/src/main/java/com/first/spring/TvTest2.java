package com.first.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvTest2 {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("application2.xml");
	
		Tv tv = ctx.getBean(LgTV.class);
		System.out.println("tv : " + tv);
	}
}
