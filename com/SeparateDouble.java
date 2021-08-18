package com;

import java.util.Scanner;

public class SeparateDouble {
	
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double x;
			System.out.println("Input decimal Value: ");
			x= sc.nextDouble();
	  		float num = (float) x;
			int integer = (int)num;		 
			double decimal = num - integer ;
			
			System.out.println(integer + " Decimal " + num);
	}

}
