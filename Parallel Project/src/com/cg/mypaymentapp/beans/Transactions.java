package com.cg.mypaymentapp.beans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class Transactions 
{
    
     ArrayList<String> transactionDetails = new ArrayList<String>();


	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Transactions(ArrayList<String> transactionDetails) {
		super();
		this.transactionDetails = transactionDetails;
	}


	public ArrayList<String> getTransactionDetails() {
		return transactionDetails;
	}


	public void setTransactionDetails(ArrayList<String> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	

	
   
	
     
     
     
}
