package com;

import java.util.Scanner;

public class SwappingNo {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Enter value of X and Y : ");
			a = sc.nextInt();
			b = sc.nextInt();
			
		System.out.println("Values of a and b before swapping: " +a+" "+b);
		
			c = a;
			a = b;
			b = c;
		
		System.out.println("Values of a and b after swapping : " +a + " " +b);
	}

}
