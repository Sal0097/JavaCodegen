package PatternProgramming;

import java.util.*;

public class NumbersRightTriP6 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 
	 for (int i=1;i<=n;i++) { // use same logic as * to print different patterns
		 for (int j=0;j<i;j++) {
			 System.out.print(j+1);
		 }
		 System.out.println();
	 }
	} 
}
//5
//1
//12
//123
//1234
//12345