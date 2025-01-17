package PatternProgramming;

import java.util.Scanner;

public class Mirrorp2triP4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {   // rows loop starts with 1 so that there is no blank line 
			for(int j=0;j<n-i;j++) { // column loop traverse from 0 to n-i and print space
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) { // print * after the space if the spaceLoop not given it becomes normal right triangle.
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

// 5
//    *
//   **
//  ***
// ****
//*****