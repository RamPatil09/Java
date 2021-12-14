package com.xworkz.collection.cloneableInterface.Mobiles;

public class NokiaMobiles implements Cloneable{

	private String name;
	private String model;
	private String color;
	private double price;
	private String operatingSystem;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	@Override
	public String toString() {
		return "NokiaMobiles [name=" + name + ", model=" + model + ", color=" + color + ", price=" + price
				+ ", operatingSystem=" + operatingSystem + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked cloneable");
		return super.clone();
	}
}
