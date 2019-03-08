package com.springcore.pojo;

public class Customer {
private String customerId;
private String customerName;
private int customerContact;
private Address customerAddress;




public Customer() {
	super();
}




public String getCustomerId() {
	return customerId;
}




public void setCustomerId(String customerId) {
	this.customerId = customerId;
}




public String getCustomerName() {
	return customerName;
}




public void setCustomerName(String customerName) {
	this.customerName = customerName;
}




public int getCustomerContact() {
	return customerContact;
}




public void setCustomerContact(int customerContact) {
	this.customerContact = customerContact;
}




public Address getCustomerAddress() {
	return customerAddress;
}




public void setCustomerAddress(Address customerAddress) {
	this.customerAddress = customerAddress;
}




public void display()
{
	System.out.println("customer details are customerId:"+getCustomerId()+"customername:"+getCustomerName()+"costumer contact:"+getCustomerContact());
	System.out.println("City= "+getCustomerAddress().getCity());
	System.out.println("street="+getCustomerAddress().getStreet());
	System.out.println("zip="+getCustomerAddress().getZip());
	System.out.println("country"+getCustomerAddress().getCountry());
	System.out.println(""+getCustomerAddress().getState());
}




public Customer(String customerId, String customerName, int customerContact, Address customerAddress) {
	super();
	this.customerId = customerId;
	this.customerName = customerName;
	this.customerContact = customerContact;
	this.customerAddress = customerAddress;
}
}
