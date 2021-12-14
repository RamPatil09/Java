package com.xworkz.collection.setinterface;

import java.util.Objects;

public class BankDTO implements Comparable<BankDTO> {

	private int id;
	private String accountHolderName;
	private long accountNumber;
	private String accountType;
	private String bankName;
	public BankDTO(int id, String accountHolderName, long accountNumber, String accountType, String bankName) {
		super();
		this.id = id;
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.bankName = bankName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "BankDTO [id=" + id + ", accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
				+ ", accountType=" + accountType + ", bankName=" + bankName + "]";
	}
	
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public int compareTo(BankDTO o) {
		// TODO Auto-generated method stub
		return this.hashCode()- o.hashCode();
	}
	
}
