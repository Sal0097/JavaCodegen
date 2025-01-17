package PatternProgramming;

import java.util.*;

public class OtherAlphabets {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		 for (int i = 0;i<n;i++) {
	//B
			 for (int j = 0;j<n;j++) {
				 if((j==0&&i!=0) || (j==n-1&& i!=0&& i!=n/2&& i!=n-1) || (i==0&& j!=0&& j!=n-1) || (i==n/2&& j!=n-1) || (i==n-1)&&j!=n-1)  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			 System.out.print("  ");
//	 //C
		 	 for (int j = 0;j<n;j++) {
		 		 if((j==0&&i!=0&& i!=n-1) || (i==0&& j!=0&& j!=n-1) || (i==n-1)&&j!=0)  {
		 			 System.out.print("# ");
			 }else {
				 System.out.print("  ");
			 	} 
		 	}
		 	System.out.print("  ");
	//D
			 for (int j = 0;j<n;j++) {
				 if((j==0) || (j==n-1&& i!=0&& i!=n-1) || (i==0&& j!=n-1) || (i==n-1)&&j!=n-1)  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			System.out.print("  ");
			
			//G
			 for (int j = 0;j<n;j++) {
				 if((j==0) || (j==n-1&& i!=0&& i!=n-1&& i>n/2) || (i==0&& j!=n-1) || (i==n-1)&&j!=n-1 || i==n/2&& j>n/2  )  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			System.out.print("  ");
			
			//K
			 for (int j = 0;j<n;j++) {
				 if((j==0) || i+j==n/2 || i-j==n/2 )  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			System.out.print("  ");
			
			//N
			 for (int j = 0;j<n;j++) {
				 if((j==0) || j==n-1 || i-j==0 )  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			System.out.print("  ");

			//M
			 for (int j = 0;j<n;j++) {
				 if((j==0) || j==n-1 || i-j==0&& i<n/2&&j<n/2 || i+j==n-1&&i<=n/2&&j>=n/2)  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			System.out.print("  ");
			
//O
			 for (int j = 0;j<n;j++) {
				 if(i+j==n/2 || j-i==n/2 ||i-j==n/2 || i+j==((n/2)+(n-1)))  {
					 System.out.print("# ");
				 }else {
					 System.out.print("  ");
				 	} 
			 	}
			System.out.println("  ");
		 }	

	}

}
