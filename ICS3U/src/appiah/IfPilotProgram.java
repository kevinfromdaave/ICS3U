package appiah;

/*
 * If Pilot Program
 * This program tells you if a number is divisible by 7 and if it's positive or negative
 * March 22st 2016
 * @Kevin Appiah
 */


import java.util.Scanner;

public class IfPilotProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Variables 
		
		int integer;
		int divisible;
		
		// Output
		
		System.out.println("Please enter a number");
		integer = Integer.parseInt(scan.nextLine());
		
		// Decisions 
		
		
		if (integer < 0 ){
			System.out.println("You number is negative");
		}
		else {
			System.out.println("Your number is positive");
		}
		
		divisible = integer % 7;
		
		
		if (divisible == 0)
		{
			System.out.println("Your number is divisible by 7");
		}
		
		else {
			System.out.println("Your number isn't divisible by 7");
		}
		

	}

}
