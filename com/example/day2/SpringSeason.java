package com.example.day2;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter day and month in integer:");
	    Scanner scan =new Scanner(System.in);
	    int d=scan.nextInt();
	    int m=scan.nextInt();
	    
	    LocalDate day1 = LocalDate.of(2022, 3, 20);    
	    LocalDate day2 = LocalDate.of(2022, 6, 20);
	    LocalDate day3 = LocalDate.of(2022, m, d);
	    
	    if(day3.isAfter(day1) && day3.isBefore(day2)) {
	    	System.out.println("True and the day is in between March and June");
	    }
	    else {
	    	System.out.println("False");
	    }
	    
	    scan.close(); 
	    
	    
	    
	    
	}

}
