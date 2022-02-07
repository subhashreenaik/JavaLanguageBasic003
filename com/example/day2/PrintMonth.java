package com.example.day2;

import java.util.Scanner;

public class PrintMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number between 1 to 12:");
	    Scanner scan =new Scanner(System.in);
	    int number=scan.nextInt();
        switch(number) {
        case 1: System.out.print("This is month January ");break;
		case 2: System.out.print("This is month February "); break;
		case 3: System.out.print("This is month March"); break;
		case 4: System.out.print("This is month April "); break;
		case 5: System.out.print("This is month May "); break;
		case 6: System.out.print("This is month June "); break;
		case 7: System.out.print("This is month July "); break;
		case 8: System.out.print("This is month August "); break;
		case 9: System.out.print("This is month September "); break;
		case 10: System.out.print("This is month October "); break;
		case 11: System.out.print("This is month November "); break;
		
		default: System.out.print("This is month December"); break;
	}

}
}
