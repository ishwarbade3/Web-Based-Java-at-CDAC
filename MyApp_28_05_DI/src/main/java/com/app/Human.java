package com.app;

public class Human {
	private Heart heart;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	public void pump() {
		if(heart!=null) {
			heart.pumping();
		}
		else {
			System.out.println("You are not Going Forward in your life");
		}
		
	}
	
	
	

}
