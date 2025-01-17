package PatternProgramming;
import java.util.*;

public class HollowBoxP8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		 for (int i = 0;i<n;i++) {
			 for (int j = 0;j<n;j++) {
				 if(i==0 || i==n-1||j==0 || j==n-1) // if any condition satisfy this * will print else space
					 System.out.print("*");
				 else
					 System.out.print(" "); // space inside the square
			  System.out.print(" ");// for space between the columns
			 }
			 System.out.println();
		 }

	}

}
//5
//* * * * * 
//*       * 
//*       * 
//*       * 
//* * * * * 
