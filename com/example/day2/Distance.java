package com.example.day2;

import java.util.Scanner;

public class Distance {

	public static  double calculateLengthLine(double x,double y) {
 	   double distance =Math.pow((Math.pow(x, 2) +Math.pow(y, 2)),0.5);
		   return  distance;
 	 
  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
	      
	       System.out.println("Enter  point x: ");
	       double x=scan.nextDouble();
	       System.out.println("Enter point y: ");
	       double y=scan.nextDouble();
	       double distance = calculateLengthLine(x,y);
	       System.out.println("Euclidean distance :"+distance);
	       scan.close();
	       
	       
	}

}
