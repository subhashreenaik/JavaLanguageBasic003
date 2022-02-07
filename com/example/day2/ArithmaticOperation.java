package com.example.day2;

import java.util.Scanner;

public class ArithmaticOperation {
	
	public static void main(String[] args) {
		
		  
    System.out.println("Enter numbers:");
	Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int d=scan.nextInt();
	
	double sol1 = a+b*c;
	double sol2 =c+a/b;
	double sol3 =a%b+c;
	double sol4 =a*b+c;
	
	double x = Math.max(Math.max(sol1, sol2),Math.max( sol3, sol4));
    System.out.println("Max value is "+x);
    double y = Math.min(Math.min(sol1, sol2),Math.min( sol3, sol4));
    System.out.println("Min value is "+y);
	
	}

}
