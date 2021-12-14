package com.xworkz.collection.cloneableInterface.ShowRooms;

public class KtmShowRooms implements Cloneable{

	private String showRoomName;
	private String type;
	private String location;
	private long contactNumber;
	private String address;
	
	public String getShowRoomName() {
		return showRoomName;
	}
	public void setShowRoomName(String showRoomName) {
		this.showRoomName = showRoomName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "KtmShowRooms [showRoomName=" + showRoomName + ", type=" + type + ", location=" + location
				+ ", contactNumber=" + contactNumber + ", address=" + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Invoked clone method");
		return super.clone();
	}
}
