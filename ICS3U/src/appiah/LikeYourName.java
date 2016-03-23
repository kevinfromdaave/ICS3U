package appiah;
/**
 * LikeYourName
 * This program tells you whether it likes your name or not
 * @author Kevin Appiah
 * Made March 23th, 2016
 **/


import java.util.Scanner;

public class LikeYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Variables
		
		String name;
		
		//Output
		
		System.out.println("Please enter a name");
		name = scan.nextLine();
		int random = (int)(Math.random() * 10) + 1;
		
		//Decisions
		
		if (random <= 3){
			System.out.println("I HATE THAT NAME!!");
		}
		
		else {
			System.out.println("I LOVE THAT NAME!!");
		}
		
	}

}
