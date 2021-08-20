package com;

import java.util.Scanner;

public class Student {
	
	Scanner sc = new Scanner(System.in);
	
	String stdName;
	int m1,m2,m3;
	double avg;
	
	
	void acceptData() {
		
		System.out.println("Enter name of Student: ");
		stdName = sc.nextLine();
		
		System.out.println("Enter marks of subject 1: ");
		m1 = sc.nextInt();
		
		System.out.println("Enter marks of subject 2: ");
		m2 = sc.nextInt();
		
		System.out.println("Enter marks of subject 3: ");
		m3 = sc.nextInt();
	}
	
	void averageMarks() {
		
		avg = (double) (m1 + m2 + m3)/3 ;
		
		System.out.println("Average marks of " +stdName + " are " +avg);
	}
	
	void result()
	{
		System.out.println("***** FINAL RESULT *****");
		if(avg >= 60) {
			System.out.println("Congrats !! You got a first class");
		}
		else if(avg >= 50) {
			System.out.println("Congrats !! You got a Second class");
		}
		else if(avg >= 35) {
			System.out.println("Congrats !! You have passed the exam");
		}
		else
		{
			System.out.println("You are failed!! Better luck next time.");
		}
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.acceptData();
		s1.averageMarks();
		s1.result();
	}
}
