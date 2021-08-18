package com;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.println("Enter any number : ");
		a = sc.nextInt();
		
		if(a%2 == 0)
		{
			System.out.println("Number is Even");
			
		}else
		{
			System.out.println("Number is Odd");
		}
	}

}
