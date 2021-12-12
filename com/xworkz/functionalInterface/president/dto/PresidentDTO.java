package com.xworkz.functionalInterface.president.dto;

public class PresidentDTO {

	private String name;
	private String age;
	private String country;
	private String language;
	
	

	public PresidentDTO(String name, String age, String country, String language) {
		this.name = name;
		this.age = age;
		this.country = country;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "PresidentDTO [name=" + name + ", age=" + age + ", country=" + country + ", language=" + language + "]";
	}

	
}
