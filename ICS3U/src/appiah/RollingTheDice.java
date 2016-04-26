package appiah;
/**
 * Rolling The Die
 * This program rolls a pair of dice, twice (one for the user, one for the computer) which ever one is higher wins
 * @author Kevin Appiah
 * Made March 23th, 2016
 **/

import java.util.Scanner;


public class RollingTheDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		//Variables

		int userDie1;
		int userDie2;
		int compDie1;
		int compDie2;
		int totalUser;
		int totalComp;
		String playAgain = "yes";

		//Calculations/Output
		while(playAgain.equalsIgnoreCase("yes")){

			userDie1 = (int)(Math.random()* 6) + 1;
			userDie2 = (int)(Math.random()* 6) + 1;
			totalUser = userDie1 + userDie2;

			System.out.println("Your number is " + totalUser);

			compDie1 = (int)(Math.random()* 6) + 1;
			compDie2 = (int)(Math.random()* 6) + 1;
			totalComp = compDie1 + compDie2;

			System.out.println("My number is " + totalComp);

			//Decisions


			if (totalUser > totalComp){
				System.out.println("That means you win :(");
			}

			else if (totalUser < totalComp){
				System.out.println("That means I win :)");
			}

			else {
				System.out.println("It's a tie.");					
			}

			System.out.println("Play again?");
			playAgain = scan.nextLine();


		}
	}
}
