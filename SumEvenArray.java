package Practice11;
import java.util.*;
public class SumEvenArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int evennumbers =0;
		int oddnumbers =1;
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elemnts in an array");
		System.out.println();
		for( int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Arrays.toString(arr));
		System.out.println();
		System.out.println("Array Created");
		for(int i=0;i<arr.length;i++) {
			if(i % 2==0) {
				evennumbers +=arr[i];
			}
			else {
				oddnumbers *=arr[i];
			}
		}
		System.out.println("addition of even numbers :" +evennumbers);
		System.out.println("Product of odd numbers is :" +oddnumbers);
	}

}