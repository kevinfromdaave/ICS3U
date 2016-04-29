package appiah;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String[] animals = {"Lion", "Tiger", "Antelope", "Crocodile", "Ape", "Dog", "Leopard", "Bear", "Wolf", "Giraffe", "Flamingo", "Rhino", "Cat", "Zebra", "Horse", "Hyena", "Sheep", "Owl", "Snake", "Donkey"};
		boolean[] n = new boolean[20];
		String rightWrong = "  ";
		String stop;
		int c = 0;
		int i = 0;
		System.out.println("Think of an animal, and I'll guess");
		
		do {
			c++;
			int guess = (int)(Math.random()*animals.length);
			if (!n[guess]){
				System.out.println("Are you think of a " + animals[guess] +  ("? R or W"));
				i++;
				rightWrong = scan.nextLine();
			
			
				if (rightWrong.equalsIgnoreCase("R")){
					
					System.out.println("I win, I`m a great guesser");
					
														
					
				}
				
				else if (animals.length == i)
				{
					
					System.out.println("Looks like I lose, I ran out of guesses");
					n[guess] = true;
				}
				
			
			}
					
			
		}while (rightWrong.equalsIgnoreCase("W"));
		

	}

}
