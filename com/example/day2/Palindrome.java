package com.example.day2;

import java.util.Scanner;

public class Palindrome {
	
	static int checkPallindrome(int number) {
		int reverse = 0;
		while(number !=0) {
	     	   int r=number%10;
	     	   reverse=reverse*10+r;
	     	   number=number/10;
	     	   
	        }
		
		  return reverse;
		
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter a number:");
	Scanner scan =new Scanner(System.in);
	int number=scan.nextInt();
	int reverse=checkPallindrome(number);
	       
        if(number == reverse) {
        System.out.println("Number is pallindrom");
        }
        else {
        	System.out.println("Number is not a pallindrom");
        }
        scan.close();

	}

}
