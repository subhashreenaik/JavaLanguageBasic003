package com.example.day2;

import java.util.Scanner;

public class ChequeLetter {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any English letter");
	    Scanner scan =new Scanner(System.in);
	    String letter=scan.nextLine();
        switch(letter) {
        case "a" : System.out.print("This letter is vowel "); break;
		case "e": System.out.print("This letter is vowel "); break;
		case "i": System.out.print("This letter is vowel "); break;
		case "o": System.out.print("This letter is vowel "); break;
		case "u": System.out.print("This letter is vowel "); break;
		default: System.out.print("This letter is Consonant "); break;
	}

}
}