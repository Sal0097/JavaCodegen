
//11/12/24
import java.util.*;
import java.util.Scanner;

public class ThrowsException  {

	public static void main(String[] args) {
		System.out.println("inside main class");
		try {
			Oper4 op4= new Oper4();
			op4.function4();
		} catch(Exception e){
			e.printStackTrace();
			}
		System.out.println("end of main class");
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	class Oper1 {
		void function1() {
			System.out.println("inside function1");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1 :");
			int num1 = sc.nextInt();                          //critical statement : -- InputmismatchException
			System.out.println("Enter the num2 :");
			int num2 = sc.nextInt();                          //critical statement : -- InputmismatchException
			double res = num1/num2;                           //critical statement : -- arithmeticException
			System.out.println(res);
			System.out.println("Division Operation completed");
			
			System.out.println("Array based operation is started :");
			System.out.println("Enter array size");
			int size = sc.nextInt();                          //critical statement : -- negativearraysizeExcetion
			int arr[]=new int[size];                          //critical statement : -- negativearraysizeExcetion
			System.out.println("Enter the elements of array");
			for(int i=0 ;i<size;i++) {
				arr[i] = sc.nextInt();                       //critical statement : -- InputmismatchException
			}               
			System.out.println("Enter the value to be searched :");
			int val = sc.nextInt();                           //critical statement : -- InputmismatchException
			for(int i=0 ;i<size;i++) {
				if(arr[i]==val) {
				System.out.println("found the element in index"+i);
				}else {
					break;
				}
			}                                    //critical statement : -- ArrayIndexoutofboundexception
			System.out.println("Left function1");
		
	}
}
////////////////////////////////////////////////////////////////////////////////////////////
class Oper2{
	void function2()  throws Exception{
		System.out.println("inside function2");
		Oper1 op1= new Oper1();
		op1.function1();
		System.out.println("left function2");
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////
class Oper3{
	void function3() throws Exception {
		try {
			System.out.println("inside function3");
			Oper2 op2= new Oper2();
			op2.function2();
			} 
			catch(Exception e){
				System.out.println("Exception handelled in function3");
				throw e; // re-throwing of exception// throwing a object of type exception
			}
		System.out.println("left function3");
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////
class Oper4{
	void function4() throws Exception{
		System.out.println("inside function4");
		Oper3 op3= new Oper3();
		op3.function3();
		System.out.println("left function4");
	}
}
////////////////////////////////////////////////////////////////////////////////////////////////

