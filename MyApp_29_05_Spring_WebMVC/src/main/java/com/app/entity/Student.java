package com.app.entity;

import java.util.HashMap;
import java.util.Map;

public class Student {
	private String fName;
	private String lName;
	private String country;
	private Map<String, String> countryOptions;
	private String favouriteLanguage;
	private String[] operatingSystem;

	public Student() {
		countryOptions = new HashMap<String, String>();

		countryOptions.put("IN", "India");
		countryOptions.put("Uk", "United-KingDom");
		countryOptions.put("FR", "France");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("De", "Germeny");
	}

	

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public String getCountry() {
		return country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public void setFavouritelanguage(String favouritelanguage) {
		this.favouriteLanguage = favouritelanguage;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

}
