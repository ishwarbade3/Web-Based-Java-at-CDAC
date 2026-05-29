package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HappyFortuneService implements FortuneService {
	
	public HappyFortuneService() {
		System.out.println("In default Happy");
	}

	@Override
	public String getFortunrService() {
		// TODO Auto-generated method stub
		return "Today is Your Luckey Day !!!!!";
	}

}
