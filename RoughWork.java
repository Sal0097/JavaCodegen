package Pkg1;
import java.util.*;

public class RoughWork {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of pattern");
		int n = sc.nextInt();
		int count=n*n;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(count);
				System.out.print("  ");
				count--;
			}
			System.out.println();
		}
		
	}

}
