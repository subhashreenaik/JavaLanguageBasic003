package com.example.day2;

import java.util.Scanner;

public class ReverseIntegerUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number:");
	    Scanner scan =new Scanner(System.in);
	    int number=scan.nextInt();
	    int reverse = 0;
        for(;number !=0;number=number/10) {
     	   int r=number%10;
     	   reverse=reverse*10+r;	 
        }
        System.out.println("The reverse no is "+reverse);
        scan.close();
	}

}
