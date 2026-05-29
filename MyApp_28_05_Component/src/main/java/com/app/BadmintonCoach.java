package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Lazy
public class BadmintonCoach implements Coach {
	private FortuneService fortuneservice;

	@Autowired
	public BadmintonCoach(@Qualifier("happyFortuneService") FortuneService fortuneservice) {
		super();
		System.out.println("In parameter of Badminton coach");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Warmup to 2 hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortunrService();
	}

}
