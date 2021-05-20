package com.samaspace.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.samaspace.metier.Compte;


@WebService
public class ServiceBank {

	
	@WebMethod(operationName = "conversionDollarToDHS")
	public double conversionToDhs(@WebParam(name = "amountOfAccount")double amount) {
		
		double x = 13;
		double y = x*amount;
		return y;
	}
	
	
	
	@WebMethod(operationName = "takeOneAccount")
	public Compte takeAccount(@WebParam(name = "codeAccount")Long code) {
		return new Compte(code, Math.random()*7990, new Date());
	}
	
	@WebMethod(operationName = "getAllAccounts") 
	public List<Compte> Accounts()
	{ 
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1L, 6799, new Date())); comptes.add(new Compte(2L, 9000, new Date())); comptes.add(new Compte(3L, 700, new Date())); comptes.add(new Compte(4L, 400, new Date())); return comptes; }
}
