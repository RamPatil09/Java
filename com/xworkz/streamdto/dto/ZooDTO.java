package com.xworkz.streamdto.dto;

public class ZooDTO {

	private int id;
	private String name;
	private String state;
	private Double ticketPrice;
	
	public ZooDTO() {
		super();
	}
	public ZooDTO(int id, String name, String state, double ticketPrice) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.ticketPrice = ticketPrice;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "ZooDTO [id=" + id + ", name=" + name + ", state=" + state + ", ticketPrice=" + ticketPrice + "]";
	}
	
}
