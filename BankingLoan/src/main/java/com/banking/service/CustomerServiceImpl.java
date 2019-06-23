package com.banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.Exception.CustomerNotFoundException;
import com.banking.entity.CustomerDetail;
import com.banking.repository.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerSevice {
@Autowired
CustomerRepository   CustomerRepository;
	@Override
	public CustomerDetail login(CustomerDetail cust)throws CustomerNotFoundException{
		CustomerDetail custde=new CustomerDetail();
		if(custde.getCustomerName()==null && custde.getAge()==0 && custde.getCreaditScore()==0 && custde.getExpense()==0 && custde.getGender()==null &&custde.getMaritaStatus()==null &&custde.getSalary()==0) {
			throw new CustomerNotFoundException("you are not filling crieteria");
		}
		return CustomerRepository.save(custde);
	}
	@Override
	public String registration(String customerName, Long customerId) {
		return null;
	}

}
