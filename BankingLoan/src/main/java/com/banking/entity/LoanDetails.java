package com.banking.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LoanDetails")
public class LoanDetails {
private Long loanAccountNumber;
private String loanStatus;
private String approavedByManager;
public Long getLoanAccountNumber() {
	return loanAccountNumber;
}
public void setLoanAccountNumber(Long loanAccountNumber) {
	this.loanAccountNumber = loanAccountNumber;
}
public String getLoanStatus() {
	return loanStatus;
}
public void setLoanStatus(String loanStatus) {
	this.loanStatus = loanStatus;
}
public String getApproavedByManager() {
	return approavedByManager;
}
public void setApproavedByManager(String approavedByManager) {
	this.approavedByManager = approavedByManager;
}
@Override
public String toString() {
	return "LoanDetails [loanAccountNumber=" + loanAccountNumber + ", loanStatus=" + loanStatus
			+ ", approavedByManager=" + approavedByManager + "]";
}

}
