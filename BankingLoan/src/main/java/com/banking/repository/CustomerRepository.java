package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banking.entity.CustomerDetail;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetail, Long>{

}
