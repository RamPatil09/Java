package com.xworkz.streamdto.dto;

public class CafeDTO {

	private int id;
	private String name;
	private String location;
	private String type;
	private Double ratings;
	
	public CafeDTO() {
		
	}

	public CafeDTO(int id, String name, String location, String type, Double ratings) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.type = type;
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getRatings() {
		return ratings;
	}

	public void setRatings(Double ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "CafeDTO [id=" + id + ", name=" + name + ", location=" + location + ", type=" + type + ", ratings="
				+ ratings + "]";
	}
}
