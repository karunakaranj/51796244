package com.banking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banking.Exception.CustomerNotFoundException;
import com.banking.entity.CustomerDetail;
import com.banking.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customerDetail")
public class CustomerController {
	CustomerServiceImpl customerServiceImpl;
@PostMapping("/login")
public ResponseEntity<CustomerDetail> registratin(@RequestBody CustomerDetail customer) throws CustomerNotFoundException{
	customerServiceImpl.login(customer);
	return null;
	
}
}
