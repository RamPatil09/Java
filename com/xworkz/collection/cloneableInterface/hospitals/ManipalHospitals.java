package com.xworkz.collection.cloneableInterface.hospitals;

public class ManipalHospitals implements Cloneable{

	private String organization;
	private String careSystem;
	private String type;
	private String patron;
	private int opened;
	
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getCareSystem() {
		return careSystem;
	}
	public void setCareSystem(String careSystem) {
		this.careSystem = careSystem;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPatron() {
		return patron;
	}
	public void setPatron(String patron) {
		this.patron = patron;
	}
	public int getOpened() {
		return opened;
	}
	public void setOpened(int opened) {
		this.opened = opened;
	}
	@Override
	public String toString() {
		return "ManipalHospitals [organization=" + organization + ", careSystem=" + careSystem + ", type=" + type
				+ ", patron=" + patron + ", opened=" + opened + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked Clone method");
		return super.clone();
	}
}
