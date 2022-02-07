package com.example.day2;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Enter a number:");
	       Scanner scan =new Scanner(System.in);
	       int number=scan.nextInt();
		   int sum=0;
           for(int i=1;i<=number;i++) {
        	 sum += i;
           }
           System.out.println("Sum of the given natural number "+sum);
           scan.close();
	}

}
