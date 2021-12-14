package com.xworkz.tasks.dto;

public class GoldDTO{

	private String shopName;
	private int karat;
	private double price;
	private int weightInGram;
	
	
	
	public GoldDTO(String shopName, int karat, double price, int weightInGram) {
		this.shopName = shopName;
		this.karat = karat;
		this.price = price;
		this.weightInGram = weightInGram;
	}

	public String getShopName(){
		return shopName;
	}
	
	public void setShopName(String shopName){
		this.shopName = shopName;
	}
	
	public int getKarat(){
		return karat;
	}
	
	public void setKarat(int karat){
		this.karat = karat;
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getWeightInGram(){
		return weightInGram;
	}
	
	public void setWeightInGram(int weightInGram){
		this.weightInGram = weightInGram;
	}

	@Override
	public String toString() {
		return "GoldDTO [shopName=" + shopName + ", karat=" + karat + ", price=" + price + ", weightInGram="
				+ weightInGram + "]";
	}
	
}
