package com.example.day2;

import java.util.Scanner;

public class DisplayUnit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a 10 digit number: ");
		Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        
        //display ten hundred
        int tenhundred = (number/1000)%10;
        System.out.println("ten hundred place digit: " + tenhundred);
        
        //Displays hundred digit
        int  hundred = (number/100)%10;
        System.out.println("Tens place digit: " + hundred);
        
        //Displays tens digit
        int tens = (number /10)%10;
        System.out.println("Tens place digit: " + tens);

        //Display ones digit
        int ones = (number/1) %10;
        System.out.println("Ones place digit: " + ones);

	}

}
