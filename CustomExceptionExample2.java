//12/12/24

import java.util.*;
public class CustomExceptionExample2 {

	public static void main(String[] args) {
		MatrimonyWeb mw = new MatrimonyWeb();
		Candidate cd= new Candidate();
		mw.marrage(cd);
		
	}

}
///////////////////////////////////////////////////////////////////////////////////////////////////////
class UnderAgeException extends Exception{
	public String getMessage() {
		return "You are less than 18 bro!!! wait till you grow up.";
	}
}
class OverAgeException extends Exception{
	public String getMessage() {
		return "You are more than 50!!! calm down thatha.";
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////
class Candidate{
	int age;
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		age = sc.nextInt();
	}
	void verify() throws UnderAgeException,OverAgeException {
		if (age<18) {
			UnderAgeException ua = new UnderAgeException();
			System.out.println(ua.getMessage());
			throw ua;	
		}else if(age>50) {
			OverAgeException oa = new OverAgeException();
			System.out.println(oa.getMessage());
			throw oa;
		}else {
			System.out.println("You are eligible to marry.");	
		}
		
	}
}
////////////////////////////////////////////////////
class MatrimonyWeb{
	public void marrage(Candidate c) {
		try {
			c.collectData();
			c.verify();
		}catch(UnderAgeException|OverAgeException e1) {
			try {
				c.collectData();
				c.verify();
			}catch(UnderAgeException|OverAgeException e2) {
				try {
					c.collectData();
					c.verify();
				}catch(UnderAgeException|OverAgeException e3) {
					try {
						c.collectData();
						c.verify();
					}catch(UnderAgeException|OverAgeException e4) {
						System.out.println("account locked due to multiple attempts.");
						System.exit(0);
					}
				}
			}
		}
	}
}