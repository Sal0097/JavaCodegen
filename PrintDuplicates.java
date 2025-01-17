package Practice11;
import java.util.*;


public class PrintDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements in an array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr)); // converts array to string format
		for(int i=0;i<arr.length;i++) {
			for(int  j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate element : "+arr[j]);
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println("the elements : " +count);	
			}
	 
            }  
        }