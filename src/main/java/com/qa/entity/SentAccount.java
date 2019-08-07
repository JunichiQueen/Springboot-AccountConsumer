package com.qa.entity;

public class SentAccount {
	
	//private Long id;
	
	private String name;
	
	private String accountNumber;
	
	private String prize;
	
	public SentAccount(String name, String accountNumber, String prize) {
		this.name=name;
		this.accountNumber=accountNumber;
		this.prize=prize;
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}

	public SentAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	@Override
	public String toString() {

		return "name: " + name + ", accountNumber: " + accountNumber + ", prize: " + prize;
	}

}
