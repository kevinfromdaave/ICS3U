package appiah;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * QuadraticEquation
 * This program tells you the roots for quadratic equation
 * March 21st 2016
 * @Kevin Appiah
 */

public class QuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//*** Variables
		int a;
		int b;
		int c;
		double x1;
		double x2;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Please enter the a value.");
		a = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the b value");
		b = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter the c value");
		c = Integer.parseInt(scan.nextLine());
		
		x1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2 * a);
		x2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c)))/(2 * a);
		
		//* Output		
		
		if (Math.pow(b, 2) - 4 * a *c<0){
			System.out.println("There aren't any roots");
		}
		else if (Math.pow(b, 2) - 4 * a * c == 0){
			System.out.println("There is only one root and it is " + df.format(x1));
		}
		else { 
			System.out.println("The roots are " + df.format(x1) + " and " + df.format(x2));			
		}
		
	}

}
