package com.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
//@Lazy
public class CricketCoach implements Coach {
	private FortuneService fortuneservice;

	public CricketCoach(@Qualifier("sadFortuneService") FortuneService fortuneservice) {
		super();
		System.out.println("In parameter of Cricket coach");
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pull the 6 daily ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortunrService();
	}
}
