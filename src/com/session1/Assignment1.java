//Write a program to print the sum of two numbers without using + operator. Other operators have
//to be used.
package com.session1;

import java.util.Scanner;

public class Assignment1 {

	private static Scanner sc;

	static int Add(int x, int y)
	{
	    // Iterate till there is no carry 
	    while (y != 0)
	    {
	        // carry now contains common set bits of x and y
	        int carry = x & y; 
	 
	        // Sum of bits of x and y where at least one of the bits is not set
	        x = x ^ y;
	 
	        // Carry is shifted by one so that adding it to x gives the required sum
	        y = carry << 1;
	    }
	    return x;
	}

	public static void main(String[] args) {
	    sc = new Scanner(System.in);
	    System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		int result = Add(num1,num2);
		System.out.println("Sum of two numbers is "+result);
	
	}


}
