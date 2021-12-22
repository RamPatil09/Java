package com.xworkz.streamdto.dto;

public class HeadPhoneDTO {

	private Integer id;
	private String brand;
	private String type;
	private String model;
	private Double price;
	
	public HeadPhoneDTO() {
		super();
	}

	public HeadPhoneDTO(Integer id, String brand, String type, String model, Double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.model = model;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "HeadPhoneDTO [id=" + id + ", brand=" + brand + ", type=" + type + ", model=" + model + ", price="
				+ price + "]";
	}
	
}
