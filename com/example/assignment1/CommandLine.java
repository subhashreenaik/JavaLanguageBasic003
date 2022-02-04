package com.example.assignment1;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int count=0;
		
		int num[]=new int[args.length];
		
		for(int i=0;i<args.length;i++) {
			try {
			 num[i] = Integer.parseInt(args[i]); 
				sum+=num[i];
			
		}
			catch (Exception e) {
				count++;
			
			}
		}
		System.out.println("summation of  numbers is "+sum);
		System.out.println("Invalid integer "+count);
		
		
		

	}

}
