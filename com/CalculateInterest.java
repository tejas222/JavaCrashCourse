package com;

import java.util.Scanner;

public class CalculateInterest {

	static Scanner sc = new Scanner(System.in);
	
	static float readValues() {
		return sc.nextFloat();
	}
	
	static float calculateSI(float p, float t , float r) {
		return (float) (p * t * r)/100;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter Value of P : ");
		float p = readValues();
		
		System.out.println("Enter Value of T : ");
		float t = readValues();
		
		System.out.println("Enter Value of R : ");
		float r = readValues();
		
		float si = calculateSI(p,t,r);
		System.out.println("SI is :" +si);
	}

}
