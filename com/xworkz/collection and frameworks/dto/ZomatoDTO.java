package com.xworkz.tasks.dto;

public class ZomatoDTO {

	private String ownerName;
	private int established;
	private String industry;
	
	public ZomatoDTO(String ownerName, int established, String industry){
		this.ownerName=ownerName;
		this.established=established;
		this.industry=industry;
	}

	
	public String getOwnerName(){
		return ownerName;
	}
	
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}
	
	public int getEstablished(){
		return established;
	}
	
	public void setEstablished(int established){
		this.established = established;
	}
	
	public String getIndustry(){
		return industry;
	}
	
	public void setIndustry(String industry){
		this.industry = industry;
	}


	@Override
	public String toString() {
		return "ZomatoDTO [ownerName=" + ownerName + ", established=" + established + ", industry=" + industry + "]";
	}
	
}
