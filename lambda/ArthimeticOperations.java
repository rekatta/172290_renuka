package com.cg.lambda;

public class ArthimeticOperations {
	public static void main(String args) {
	calculator add =(a,b)->a+b;
	System.out.println("The addition :"+add.operation(10,3));
	calculator sub = (a,b) -> a-b;
	System.out.println("The substraction :"+sub.operation(9,2));
	calculator multiplication = (a,b) -> a*b;
	System.out.println("The multiplication is :"+multiplication.operation(19,9));
	calculator division = (a,b) -> a/b;
	System.out.println("The division is :"+division.operation(8,2));

}
}