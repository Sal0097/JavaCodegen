import java.util.*;
public class CustomException {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		NetBanking nb = new NetBanking();
		nb.verify(c1);
		
	}
}

class InvalidAccnoException extends Exception{ // Exception is inbuilt class
	public String getMessage() {
		return"Account number is invalid try again!!";
	}
}
class InvalidPassworException extends Exception{
	public String getMessage() {
		return"Password is invalid try again!!";
	}
}
class Customer{
	private int accno;
	private int passwor;
	private int ans_accno=1111;
	private int ans_passwor= 2222;
	
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account number:");
		accno = sc.nextInt();
		System.out.println("enter the Password:");
		passwor = sc.nextInt();
	}
	
	void validate() throws InvalidAccnoException,InvalidPassworException{
		if (accno==ans_accno) {
			if (passwor==ans_passwor) {
				System.out.println("valid user");
			} else {
				InvalidPassworException ipe = new InvalidPassworException();
				System.out.println(ipe.getMessage());
				throw ipe;
			}
		}else {
			
			InvalidAccnoException iae = new InvalidAccnoException();
			System.out.println(iae.getMessage());
			throw iae;
		}
	}
}

class NetBanking{
	void verify(Customer c) {
		try {
			c.collectData();
			c.validate();
		}
		catch(InvalidAccnoException|InvalidPassworException e1) {
			try {
				c.collectData();
				c.validate();
			}
			catch(InvalidAccnoException|InvalidPassworException e2){
				try {
					c.collectData();
					c.validate();
				}
				catch(InvalidAccnoException|InvalidPassworException e3){
					System.out.println("User is blocked");
					System.exit(0);
				}
				
			}
		}
	}
}

