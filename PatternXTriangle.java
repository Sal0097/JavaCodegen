package PatternProgramming;

import java.util.Scanner;

public class PatternXTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n size:");
		int n = sc.nextInt();
		while(n%2==0) {
			System.out.println("enter an odd number perferably greater than 10");
			break;
		}
			for(int i = 0; i<n; i++) {
				for(int j=0;j<n;j++) {
					if((i==n/2) || (i+j==5) || (j-i==n/2) || (i-j==n/2) || (j+i==((n/2)+(n-1))) ) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}

	}

}
