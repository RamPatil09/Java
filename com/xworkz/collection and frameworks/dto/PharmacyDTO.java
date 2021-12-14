package com.xworkz.tasks.dto;

public class PharmacyDTO{

	private String pharmacyName;
	private String location;
	private long contactNo;
	
	public PharmacyDTO(String pharmacyName, String location, long contactNo) {
		this.pharmacyName=pharmacyName;
		this.location=location;
		this.contactNo=contactNo;
	}
	
	public String getPharmacyName(){
		return pharmacyName;
	}
	
	public void setPharmacyName(String pharmacyName){
		this.pharmacyName = pharmacyName;
	}
	
	public String getLocation(){
		return location;
	}
	
	public void setLocation(String location){
		this.location = location;
	}
	
	public long getContactNo(){
		return contactNo;
	}
	
	public void setContactNo(long contactNo){
		this.contactNo = contactNo;
	}

	@Override
	public String toString() {
		return "PharmacyDTO [pharmacyName=" + pharmacyName + ", location=" + location + ", contactNo=" + contactNo
				+ "]";
	}
	
}
