package com.xworkz.streamdto.dto;

public class TempleDTO {

	private Integer id;
	private String name;
	private String location;
	private Integer visitorsPerday;
	
	public TempleDTO() {
		super();
	}

	public TempleDTO(Integer id, String name, String location, Integer visitorsPerday) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.visitorsPerday = visitorsPerday;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getVisitorsPerday() {
		return visitorsPerday;
	}

	public void setVisitorsPerday(Integer visitorsPerday) {
		this.visitorsPerday = visitorsPerday;
	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", visitorsPerday="
				+ visitorsPerday + "]";
	}
	
	
}
