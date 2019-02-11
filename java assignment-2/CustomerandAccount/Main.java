package CustomerandAccount;

public class Main {

	public static void main(String[] args) {
		customer c = new customer(1,"renu",'f');
		Account a = new Account(111, c, 890.09);
		System.out.println("Details");
		System.out.println(a);
		a.deposit(86542.67);
		a.withdraw(5643.87);


	}

}
