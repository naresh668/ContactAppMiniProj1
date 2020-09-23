package com.exmple.dto;

import lombok.Data;

@Data



public class Contact {

	
private int id;
	
	
	private String eName;
	
	
	private String eMail;
	
	
	private String eNum;
	
	public Contact() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	

	

	public String geteNum() {
		return eNum;
	}

	public void seteNum(String eNum) {
		this.eNum = eNum;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", eName=" + eName + ", eMail=" + eMail + ", eNum=" + eNum + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
