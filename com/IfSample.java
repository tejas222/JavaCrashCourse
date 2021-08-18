package com;

public class IfSample {
	public static void main(String[] args) {
		int x, y;
		x	= 	10;
		y	=	20;
		
		if(x > y) {
			System.out.println("X is greater than y");
		}else
		{
			System.out.println("Y is Greater than x");
		}
		
		x = x * 2;
		
		if(x == y) {
			System.out.println("X is equal to y");
		}else
		{
			System.out.println("X is not equal to y");
		}
		
	}

}
