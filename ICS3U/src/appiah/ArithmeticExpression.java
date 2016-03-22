package appiah;
/**
 * Arithmetic Expressions
 * This the program calculates a bunch of arithmetic expressions, and displays them
 * @author Kevin Appiah
 * Made March 10th, 2016
 **/



import java.util.Scanner;

public class ArithmeticExpression {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			
			int numOne;
			int numTwo;
			int numThree;
			int numFour;
			int numFive;
			int sum;
			int difference;
			int valThree;
			double valFour;
			int valFive;
			double valSix;
			double valSeven;						
			
			
			System.out.println("Please enter the first number");
			numOne = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter the second number");
			numTwo = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter the third number");
			numThree = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter the fourth number");
			numFour = Integer.parseInt(scan.nextLine());
			System.out.println("Please enter the fifth number");
			numFive = Integer.parseInt(scan.nextLine());
			
			sum = numOne + numTwo + numThree + numFour + numFive;
			difference = numThree - numTwo;
			valThree = numOne * numFive;
			valFour = (double)numFour/numTwo;
			valFive = numFour % numTwo;
			valSix = Math.pow(numOne,numThree);
			valSeven = Math.sqrt(numFive);
			
			System.out.println("The sum of all five numbers is " + sum);
			System.out.println("Subtracting the second number from the third is: " + difference);
			System.out.println("The first number multiplied by the fifth number is: " + valThree);
			System.out.println("The quotient of the fourth number divided by the second is: " + valFour);
			System.out.println("The remmainder of the fourth number divided by the second is: " + valFive);		
			System.out.println("The first number to the power of the third is: " + valSix);
			System.out.println("The square root of the fifth number is: " + valSeven);
					
	}

}
