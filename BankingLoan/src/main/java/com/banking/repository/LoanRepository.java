package com.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.entity.LoanDetails;

public interface LoanRepository extends JpaRepository<LoanDetails, Long>{

}
