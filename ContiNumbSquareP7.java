package PatternProgramming;

import java.util.Scanner;

public class ContiNumbSquareP7 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int count =n*n; // start from 1 for ascending order.
		 for (int i=1;i<=n;i++) { 
			 for (int j=1;j<=n;j++) {
				 System.out.printf("%3d",count); // printf is special inbuilt method used to format and print output on console
				 System.out.print("    ");
				 
				 count--;
			 }
			 System.out.println();
		 }

	}

}
//5
//25     24     23     22     21    
//20     19     18     17     16    
//15     14     13     12     11    
//10      9      8      7      6    
// 5      4      3      2      1    