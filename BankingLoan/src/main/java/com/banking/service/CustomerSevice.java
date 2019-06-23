package com.banking.service;

import com.banking.Exception.CustomerNotFoundException;
import com.banking.entity.CustomerDetail;

public interface CustomerSevice {
public CustomerDetail login(CustomerDetail cust) throws CustomerNotFoundException;
public String  registration(String customerName,Long customerId);
}
