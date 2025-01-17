package com.test.arrayPrograms;
import java.util.*;

public class ArrayCode1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student count: ");
		int n = sc.nextInt();
		
		int a[]= new int[n]; // array declaration of size n where a is pointing to memory location
		for(int i=0;i<n;i++) {
			System.out.println(" This is Student number :"+(i+1));
		}
		
	}

}
