package com.cg.mypaymentapp.repo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;

public interface WalletRepo 
{
    public boolean save(Customer customer);
	
	public Customer findOne(String mobileNo);
	
	
}
