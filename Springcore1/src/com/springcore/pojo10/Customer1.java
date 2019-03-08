package com.springcore.pojo10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.springcore.pojo.Address;

public class Customer1 implements ApplicationContextAware, BeanNameAware {
	private String customerId;
	private String customerName;
	private int customerContact;
	private Address1 customerAddress;
	private ApplicationContext context;

	public Customer1() {
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

	public Customer1(String customerId, String customerName, int customerContact, Address1 customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
		
	}

	public Address1 getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(Address1 customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void display() {
		System.out.println("customer details are customerId:" + getCustomerId() + "customername:" + getCustomerName()
				+ "costumer contact:" + getCustomerContact());
		System.out.println("City= " + getCustomerAddress().getCity());
		System.out.println("street=" + getCustomerAddress().getStreet());
		System.out.println("zip=" + getCustomerAddress().getZip());
		System.out.println("country" + getCustomerAddress().getCountry());
		System.out.println("" + getCustomerAddress().getState());
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {

		this.context = context;
		System.out.println(context);
	}

	@Override
	public void setBeanName(String BeanName) {
		System.out.println("bean name is:" + BeanName);

	}
}

