package com.cg.mypaymentapp.repo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;
import com.cg.mypaymentapp.beans.Wallet;

public class WalletRepoImpl implements WalletRepo 
{
	private Map<String, Customer> data ;
			
	
	
	
	

	public WalletRepoImpl()
	{
		data = new HashMap<String, Customer>();
	}

	public WalletRepoImpl(Map<String, Customer> data) 
	{
		super();
		this.data = data;
	}
	
	
	
	@Override
	public boolean save(Customer customer) 
	{
		data.put(customer.getMobileNo(), customer);
		return true;
	}

	@Override
	public Customer findOne(String mobileNo) 
	{
		boolean check = false;
		check = data.containsKey(mobileNo);
		
		if(check)
			return data.get(mobileNo);
		else
		    return null;
	}

	

}
