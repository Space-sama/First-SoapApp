package com.samaspace.metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

	private Long codeAcount;
	private double amountAcount;
	
	//@XmlTransient
	private Date dateCreationOfAccount;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(Long codeAcount, double amountAcount, Date dateCreationOfAccount) {
		super();
		this.codeAcount = codeAcount;
		this.amountAcount = amountAcount;
		
		this.dateCreationOfAccount = dateCreationOfAccount;
	}
	public Long getCodeAcount() {
		return codeAcount;
	}
	public void setCodeAcount(Long codeAcount) {
		this.codeAcount = codeAcount;
	}
	public double getAmountAcount() {
		return amountAcount;
	}
	public void setAmountAcount(double amountAcount) {
		this.amountAcount = amountAcount;
	}
	
	
	public Date getDateCreationOfAccount() {
		return dateCreationOfAccount;
	}
	public void setDateCreationOfAccount(Date dateCreationOfAccount) {
		this.dateCreationOfAccount = dateCreationOfAccount;
	}
	
	
	
}
