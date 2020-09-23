package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;



@Data





@Entity
@Table(name="contacts")

public class ContactEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int id;
	
	
	private String eName;
	
	
	private String eMail;
	
	
	private String eNum;
	
	
	public ContactEntity() {
		
		
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


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String geteNum() {
		return eNum;
	}


	public void seteNum(String eNum) {
		this.eNum = eNum;
	}


	
	
	 

	
	


	

}
