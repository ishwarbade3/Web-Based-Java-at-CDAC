package com.app;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SadFortuneService implements FortuneService {

	public SadFortuneService() {
		System.out.println("In default Sad");
	}
	@Override
	public String getFortunrService() {
		// TODO Auto-generated method stub
		return "Better Lick Next Time!!!!!";
	}

}
