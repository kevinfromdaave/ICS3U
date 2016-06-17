package appiah;
import java.util.Scanner;

public class testingThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.println("Please enter a number");
		number = scan.nextInt();
		
		int two = number % 2;
		int three = number % 3;
		int four = number % 4;
		int five = number % 5;
		int six = number % 6;
		int seven = number % 7;
		int eight = number % 8;
		int nine = number % 9;
		
		if (two == 0||three == 0|| four == 0|| five == 0 || six == 0|| seven == 0|| eight == 0|| nine == 0)
		{
			System.out.println(number + " is a not prime number");
		}
		else 
		{
			System.out.println(number + " is a prime number");
		}
			
		
		
		
		
		

	}

}
