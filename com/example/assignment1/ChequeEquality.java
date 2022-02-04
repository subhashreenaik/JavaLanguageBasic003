package com.example.assignment1;

import java.util.Scanner;

public class ChequeEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s =new Scanner(System.in);
        String first =s.next();
        String second =s.next();
        
        if(first.equals(second)) {
        	System.out.println("Two string are equal");
        }
        else {
        	System.out.println("Two string are not equal");
        }
        
	}

}
