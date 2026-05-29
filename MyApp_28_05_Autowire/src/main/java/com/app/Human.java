package com.app;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	// @Autowired // field level autoWiring
	private Heart heart;

	public Human() {
		// TODO Auto-generated constructor stub
	}

	 @Autowired // constructor level autoWiring
	public Human(@Qualifier("OctopusHeart") Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	@Autowired
	public void setHeart(@Qualifier("humanHeart")Heart heart) {
		this.heart = heart;
	}

	public void pump() {
		
		System.out.println(heart.getNameOfAnimal());
		System.out.println(heart.getNoOfHeart());
		if (heart != null) {
			heart.pumping();
		} else {
			System.out.println("You are not Going Forward in your life");
		}

	}

}
