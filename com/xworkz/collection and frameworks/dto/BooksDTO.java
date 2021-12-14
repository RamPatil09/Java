package com.xworkz.tasks.dto;

public class BooksDTO {

	private String bookName;
	private double price;
	private int noOfEdition;
	
	public BooksDTO(String bookName, double price, int noOfEdition) {
		this.bookName=bookName;
		this.price=price;
		this.noOfEdition=noOfEdition;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoOfEdition() {
		return noOfEdition;
	}

	public void setNoOfEdition(int noOfEdition) {
		this.noOfEdition = noOfEdition;
	}

	@Override
	public String toString() {
		return "BooksDTO [bookName=" + bookName + ", price=" + price + ", noOfEdition=" + noOfEdition + "]";
	}
	
	
}
