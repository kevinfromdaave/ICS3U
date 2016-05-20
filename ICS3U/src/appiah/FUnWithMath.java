
package appiah;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * FunWithMath
 * This program add two integers, subtract two integers, multiplies two integers and divides two integers(Same two integers)
 * May 20th 2016
 * @Kevin Appiah 
 */

public class FUnWithMath {
	
	 static DecimalFormat df = new DecimalFormat("0.00");

	 /**
	  * 
	  * @param args
	  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		// Variables
		int num1;
		int num2;
		
	
		
		// Output/Input
		System.out.println("Please eneter two numbers.");
		
		try{
		num1 = Integer.parseInt(scan.nextLine());		
		num2 = Integer.parseInt(scan.nextLine());
				
		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);
		}catch(Exception e){
			System.out.println("Error Occured " + e.getMessage());
		}
		
	}
	
	/**
	 * Method for adding the two integers
	 * @param getnum1
	 * @param getnum2
	 */
	private static void add (int getnum1, int getnum2){
			
		System.out.println(getnum1 + " + " + getnum2 + " = " + (getnum1 + getnum2));			
	}
	
	/**
	 * Method for subtracting the two integers
	 * @param getnum1
	 * @param getnum2
	 */
	private static void subtract (int getnum1, int getnum2){
		
		System.out.println(getnum1 + " - " + getnum2 + " = " + (getnum1 - getnum2));
		
	}
	
	/**
	 * Method for multiplying the two integers
	 * @param getnum1
	 * @param getnum2
	 */
	private static void multiply (int getnum1, int getnum2){
		
		System.out.println(getnum1 + " * " + getnum2 + " = " + (getnum1 * getnum2));
		
	}
	
	/**
	 * Method for dividing two integers
	 * @param getnum1
	 * @param getnum2
	 */
	private static void divide (int getnum1, int getnum2){
		
		
		System.out.println(getnum1 + " / " + getnum2 + " = " + (df.format((double)getnum1 / getnum2)));
		
		
	}
	
	
	

}
