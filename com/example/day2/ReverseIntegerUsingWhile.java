package com.example.day2;

import java.util.Scanner;

public class ReverseIntegerUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       System.out.println("Enter a number:");
	       Scanner scan =new Scanner(System.in);
	       int number=scan.nextInt();
	       int reverse = 0;
           while(number !=0) {
        	   int r=number%10;
        	   reverse=reverse*10+r;
        	   number=number/10;
        	   
           }
           System.out.println("The reverse no is "+reverse);
           scan.close();
	}

}
