package com.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetail")
public class CustomerDetail {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Long customerId;
private String customerName;
private String gender;
private String maritaStatus;
private Integer age;
private Long salary;
private Integer creaditScore;
private Integer expense;

public CustomerDetail(Long customerId, String customerName, String gender, String maritaStatus, Integer age,
		Long salary, Integer creaditScore, Integer expense) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.gender = gender;
	this.maritaStatus = maritaStatus;
	this.age = age;
	this.salary = salary;
	this.creaditScore = creaditScore;
	this.expense = expense;
}
public CustomerDetail() {
	// TODO Auto-generated constructor stub
}
public Long getCustomerId() {
	return customerId;
}
public void setCustomerId(Long customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMaritaStatus() {
	return maritaStatus;
}
public void setMaritaStatus(String maritaStatus) {
	this.maritaStatus = maritaStatus;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public Long getSalary() {
	return salary;
}
public void setSalary(Long salary) {
	this.salary = salary;
}
public Integer getCreaditScore() {
	return creaditScore;
}
public void setCreaditScore(Integer creaditScore) {
	this.creaditScore = creaditScore;
}
public Integer getExpense() {
	return expense;
}
public void setExpense(Integer expense) {
	this.expense = expense;
}
@Override
public String toString() {
	return "CustomerDetail [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender
			+ ", maritaStatus=" + maritaStatus + ", age=" + age + ", salary=" + salary + ", creaditScore="
			+ creaditScore + ", expense=" + expense + "]";
}

}
