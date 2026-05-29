
package com.app;

public class Heart {
	
	private String noOfHeart;
	private String nameOfAnimal;
	public String getNoOfHeart() {
		return noOfHeart;
	}
	public String getNameOfAnimal() {
		return nameOfAnimal;
	}
	public void setNoOfHeart(String noOfHeart) {
		this.noOfHeart = noOfHeart;
	}
	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}
	public void pumping() {
		System.out.println("You Are still Alive !!");
		System.out.println("So Live freely  !!");
	}
	public Heart(String noOfHeart, String nameOfAnimal) {
		super();
		this.noOfHeart = noOfHeart;
		this.nameOfAnimal = nameOfAnimal;
	}
	public Heart() {
		super();
	}
	
	

}
