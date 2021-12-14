package com.xworkz.tasks.dto;

public class KfcDTO{

	private String founderName;
	private int foundedIn;
	private String industry;
	private String revenue;
	
	public KfcDTO(String founderName, int foundedIn, String industry, String revenue) {
		this.founderName = founderName;
		this.foundedIn = foundedIn;
		this.industry = industry;
		this.revenue = revenue;
	}

	public String getFounderName(){
		return founderName;
	}
	
	public  void setFounderName(String founderName){
		this.founderName = founderName;
	}
	
	public int getFoundedIn(){
		return foundedIn;
	}
	
	public void setFoundedIn(int foundedIn){
		this.foundedIn = foundedIn;
	}
	
	public String getIndustry(){
		return industry;
	}
	
	public void setIndustry(String industry){
		this.industry = industry;
	}
	
	public String getRevenue(){
		return revenue;
	}
	
	public void setRevenue(String revenue){
		this.revenue = revenue;
	}

	@Override
	public String toString() {
		return "KfcDTO [founderName=" + founderName + ", foundedIn=" + foundedIn + ", industry=" + industry
				+ ", revenue=" + revenue + "]";
	}
	
}