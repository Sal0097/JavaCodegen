//9/12/24

import java.util.*;
public class TryCatchSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter num1:");
			int num1=sc.nextInt();
			System.out.println("Enter num2:");
			int num2=sc.nextInt();
			int res = num1/num2; // here if you do 11/0(example) it is usually handled by default exception handler but here it is user defined.
			System.out.println(res);
		}
		catch(Exception e){
			System.out.println("Laude created exception and i handlesd it"); // issue is if there is some other exception the error shown is same without precise issue details.
		}

	}

}
