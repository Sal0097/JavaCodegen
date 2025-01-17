package PatternProgramming;
import java.util.*;

public class PyramidP5 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 
	 for (int i = 0;i<=n;i++) {
		 for (int j = 0;j<n-i;j++) {
			 System.out.print(" ");
			 
		 }
		 for(int k=0;k<n;k++) { // same as mirror right triangle but here k<n instead of k<i
		 System.out.print("*");
		 } 
		 System.out.println();
	 }
 }
 
}
//5
//     *****
//    *****
//   *****
//  *****
// *****
//*****
