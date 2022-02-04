package com.example.assignment1;

public class StaticExample {
	static int a;
	 static int b;
	 static {
		System.out.println("static block will execute first");
	    a = 10;
	    b = 20;
	   
	 }
  static void increment() {
	System.out.println("inside the static method");
	a++;
	b++;
System.out.println("Value of a = " + a);
System.out.println("Value of b = " + b);
	
}
	 
	 
	public static void main(String[] args) {
		StaticExample x=new StaticExample();
		StaticExample y=new StaticExample();
		increment();
		x.increment();
		y.increment();
		

		 	}
		
	}


