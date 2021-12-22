package com.xworkz.streamdto.dto;

public class RiverDTO {

	private Integer id;
	private String name;
	private String state;
	private Double length;
	private Integer noOfDams;
	
	public RiverDTO() {
		super();
	}

	public RiverDTO(Integer id, String name, String state, Double length, Integer noOfDams) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.length = length;
		this.noOfDams = noOfDams;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Integer getNoOfDams() {
		return noOfDams;
	}

	public void setNoOfDams(Integer noOfDams) {
		this.noOfDams = noOfDams;
	}

	@Override
	public String toString() {
		return "RiverDTO [id=" + id + ", name=" + name + ", state=" + state + ", length=" + length + ", noOfDams="
				+ noOfDams + "]";
	}
	
	
}
