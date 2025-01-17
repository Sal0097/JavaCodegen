
//10/12/24
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in);) {
			
			System.out.println("Enter the num1 :");
			int num1 = sc.nextInt();                          //critical statement : -- InputmismatchException
			System.out.println("Enter the num2 :");
			int num2 = sc.nextInt();                          //critical statement : -- InputmismatchException
			int res = num1/num2;                              //critical statement : -- arithmeticException
			System.out.println(res);
			System.out.println("Division Operation completed");
			System.out.println("Array based operation is started :");
			System.out.println("Enter array size");
			int size = sc.nextInt();                          //critical statement : -- negativearraysizeExcetion
			int arr[]=new int[size];                          //critical statement : -- negativearraysizeExcetion
			System.out.println("Enter the array index position to add data ");
			int pos = sc.nextInt();                           //critical statement : -- InputmismatchException
			System.out.println("Enter the value to be added:");
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
		catch(NegativeArraySizeException e3) {
			System.out.println("Array size cannot be negative");
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			System.out.println("Index out of bound");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
	}
}