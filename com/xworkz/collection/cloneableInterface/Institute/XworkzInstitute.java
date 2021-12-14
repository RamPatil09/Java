package com.xworkz.collection.cloneableInterface.Institute;

public class XworkzInstitute implements Cloneable{

	private String name;
	private String owner;
	private int noOfBranches;
	private String course;
	private long contactNumber;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "XworkzInstitute [name=" + name + ", owner=" + owner + ", noOfBranches=" + noOfBranches + ", course="
				+ course + ", contactNUmber=" + contactNumber + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked cloneable");
		return super.clone();
	}
}
