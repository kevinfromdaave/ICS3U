package appiah;
import java.util.Scanner;
/* 
 * WordGuess
 * This program plays a guessing game with the user
 * Kevin Appiah
 * May 11, 2016
 */

public class WordGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String[] animals = {"lion", "tiger", "hare", "dragon", "ape", "dog", "leopard", "bear", "wolf", "monkey"};
		
		//variables
		int pcGuess = (int)(Math.random()*animals.length);
		String animal = animals[pcGuess];
		String dashes = "";
		String letter = null;
		String userGuess;
		int num;
		boolean correct = false;
		int counter = 0;
	
		

		for (int i = 0; i<animal.length(); i++){

			dashes = dashes + "-";			

		}
		
		//Output

		System.out.println("Let's play a guessing game, guess what word I'm thinking of, by guessing a single letter. I'll tell you if the letter is right or wrong");
		System.out.println("Print ! to guess the entire word");
		System.out.println(dashes);


		do {
			if(dashes.equals(animals[pcGuess])){
				correct = true;
			}
			else{
				
					
					counter++;
					System.out.println("Guess a letter");
					letter = scan.nextLine().toLowerCase();
					if (letter.equals("!")){
						correct = false;
					}
					else {
						num = animals[pcGuess].indexOf(letter);
						
					
					
				
					if (num == -1){
						
						System.out.println("That letter isn't in the word");
					}
					else{
						dashes = dashes.substring(0, num) + letter + dashes.substring((num+1),dashes.length());
						System.out.println(dashes);
					}
				}
			}



		}while(!correct && !letter.equals("!"));

		if(letter.equals("!")){
			System.out.println("Enter the whole word now");
			userGuess = scan.nextLine();

			if (userGuess.equals(animals[pcGuess])){
				System.out.println("You got it right, congratulations, you win in " + counter + " turns");
				
			}
			else {
				System.out.println("Sorry that wasn't the word, you were wrong. That means you lose");
			}
		}
		else{
			System.out.println("You guessed the word right. That means you win, congratulations");
		}








	}

}
