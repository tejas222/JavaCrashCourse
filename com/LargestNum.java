package com;

import java.util.Scanner;

public class LargestNum {
	
		Scanner sc  = new Scanner(System.in);
	
		int a , b, c;
	
	void acceptData() {
		System.out.println("Enter Values :"  );
		a = sc.nextInt();
		
		//System.out.println("Enter second number :"  );
		b = sc.nextInt();
		
		//System.out.println("Enter third number :"  );
		c = sc.nextInt();
	}
	
	void disp()
	{
		System.out.println(a+" "+ b+" "+ c);
	}
	
	void firstLargest() {
		
		if(a > b && a > c )
		{
			System.out.println("First Largest number is :" +a);
		}
		else if(b > a && b > c )
		{
			System.out.println("First Largest number is :" +b);
		}
		else if(c > a && c > b )
		{
			System.out.println("First Largest number is :" +c);
		}
	}
	
	void secondLargest() {
		
		if(a > b && a > c ) {
			if(b>c) {
				System.out.println("Second Largest number is :" +b);
			}
			else {
				System.out.println("Second Largest number is :" +c);
			}
		}else if(b>c && b>a){
			if(c>a) {
				System.out.println("Second Largest number is :" +c);
			}else {
				System.out.println("Second Largest number is :" +a);
			}
		}else if(c>b && c>a){
			if(a>b) {
				System.out.println("Second Largest number is :" +a);
			}else {
				System.out.println("Second Largest number is :" +b);
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		
		LargestNum l1 = new LargestNum();
		
		l1.acceptData();
		l1.disp();
		l1.firstLargest();
		l1.secondLargest();
	

	
	}
	
	
	
	
	
}
