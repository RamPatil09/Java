package com.xworkz.collection.cloneableInterface.Bottles;

public class Bottles implements Cloneable{

	private String name;
	private double alcoholByVolume;
	private String manufacturer;
	private String color;
	private int introduced;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAlcoholByVolume() {
		return alcoholByVolume;
	}
	public void setAlcoholByVolume(double alcoholByVolume) {
		this.alcoholByVolume = alcoholByVolume;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getIntroduced() {
		return introduced;
	}
	public void setIntroduced(int introduced) {
		this.introduced = introduced;
	}
	@Override
	public String toString() {
		return "Bottles [name=" + name + ", alcoholByVolume=" + alcoholByVolume + ", manufacturer=" + manufacturer
				+ ", color=" + color + ", introduced=" + introduced + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked clone method");
		return super.clone();
	}
}
