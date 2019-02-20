package com.cg.lambda;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface m=(price,n)->{
			if(price>(10000))
			{
			System.out.println(n);
			}
			return price;
			};
		System.out.println(m.order(9000, "Completed"));
		System.out.println(m.order(10001, "Completed"));
		System.out.println(m.order(100009, "Accepted"));		

	}

}
