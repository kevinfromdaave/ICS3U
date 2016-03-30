package appiah;
/**
 * Grade Program
 * This the program calculates a bunch of grades
 * @author Kevin Appiah
 * Made March 30th, 2016
 **/


import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Variables
		int grades;
		int T;
		
		
		System.out.println("Please enter the number of grades, you will enter");
		T = Integer.parseInt(scan.nextLine());
		
		//Loops
		for (int i = 0; i<T; i++){
			System.out.println("Please enter the grade");
			grades = scan.nextInt();
			
			if (0 <= grades && grades <= 49 ){
				System.out.println("F");
			}
			else if (50 <= grades && grades <= 59){
				System.out.println("D");
			}
			else if (60 <= grades && grades <= 69){
				System.out.println("C");
			}
			else if (70 <= grades && grades <= 79){
				System.out.println("B");
			}
			else if (80 <= grades && grades <= 100){
				System.out.println("A");
			}
			
		}
		
		
		
		

	}

}
