
//10/12/24
import java.util.InputMismatchException;
import java.util.Scanner;

public class SingleCatchforDifferentExceptons {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num1 :");
			int num1 = sc.nextInt();                          //critical statement : -- InputmismatchException
			System.out.println("Enter the num2 :");
			int num2 = sc.nextInt();                          //critical statement : -- InputmismatchException
			double res = num1/num2;                              //critical statement : -- arithmeticException
			System.out.println(res);
			System.out.println("Division Operation completed");
			System.out.println("Array based operation is started :");
			int size = sc.nextInt();                          //critical statement : -- negativearraysizeExcetion
			int arr[]=new int[size];                          //critical statement : -- negativearraysizeExcetion
			System.out.println("Enter the array position ");
			int pos = sc.nextInt();                           //critical statement : -- InputmismatchException
			System.out.println("Enter the value to be searched :");
			int val = sc.nextInt();                           //critical statement : -- InputmismatchException
			arr[pos]=val;                                     //critical statement : -- ArrayIndexoutofboundexception
			System.out.println("Data added");
			System.out.println("the value is found and array operation completed");
		}
		catch(ArithmeticException e1) {
			System.out.println("Arithmetic Exception generated due to / by 0 problem is handled");
		}
		catch(InputMismatchException e2) {
			System.out.println("Invalid input is provided");
		}
		catch(ArrayIndexOutOfBoundsException | NegativeArraySizeException e3) {
			System.out.println("Index out of bound");
		}
		catch(Exception e) { //general exception
			System.out.println("Exception handled");
		}
	}
}