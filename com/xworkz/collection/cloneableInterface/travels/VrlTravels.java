package com.xworkz.collection.cloneableInterface.travels;

public class VrlTravels implements Cloneable{

	private String travels;
	private String owner;
	private int founded;
	private String headQuaters;
	private String foundedPlace;
	
	public String getTravels() {
		return travels;
	}
	public void setTravels(String travels) {
		this.travels = travels;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getFounded() {
		return founded;
	}
	public void setFounded(int founded) {
		this.founded = founded;
	}
	public String getHeadQuaters() {
		return headQuaters;
	}
	public void setHeadQuaters(String headQuaters) {
		this.headQuaters = headQuaters;
	}
	public String getFoundedPlace() {
		return foundedPlace;
	}
	public void setFoundedPlace(String foundedPlace) {
		this.foundedPlace = foundedPlace;
	}
	@Override
	public String toString() {
		return "VrlTravels [travels=" + travels + ", owner=" + owner + ", founded=" + founded + ", headQuaters="
				+ headQuaters + ", foundedPlace=" + foundedPlace + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked clone method");
		return super.clone();
	}
}
