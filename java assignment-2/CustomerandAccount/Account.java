package CustomerandAccount;

public class Account {
int id;
customer customer;
double balance=0.0;

public Account(int id, CustomerandAccount.customer customer, double balance) {
	super();
	this.id = id;
	this.customer = customer;
	this.balance = balance;
}
public int getId() {
	return id;
}
public customer getCustomer() {
	return customer;
}

public double getbalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public double deposit( double amount) {
return amount+=balance;	
}
public double withdraw( double amount) {
   if(balance >= amount) {
	  System.out.println("Subtract amount to balance");
   }
	   else
	   {
		   System.out.println("amount withdrawn");
	  
   }
   return balance;

}
}
