package com.first.spring;


import org.springframework.stereotype.Component;

@Component
public class SamsungTV extends Tv {
		
	public SamsungTV() {
		super(10, 20);
		System.out.println("samsung TV 생성");
	}
	
//	public SamsungTV(int maxCh, int maxVol, Speaker speaker) {
//		super(maxCh, maxVol, speaker);
//	}
}
