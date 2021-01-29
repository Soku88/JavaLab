package com.first.spring;

import org.springframework.stereotype.Component;

@Component
public class LgTV extends Tv {

	public LgTV() {
		super(20, 10);
		System.out.println("LG TV 생성");
	}

}
