package com.xworkz.tasks.dto;

public class BankDTO {

	private String bankName;
	private String area;
	
	public BankDTO(String name, String area) {
		bankName=name;
		this.area=area;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "BankDTO [bankName=" + bankName + ", area=" + area + "]";
	}
	
	
}
