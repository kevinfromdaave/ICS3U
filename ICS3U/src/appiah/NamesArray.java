package appiah;

import java.util.Scanner;

public class NamesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);

		int n;
		System.out.println("Please enter the amount of names you are inputting");
		n = Integer.parseInt(scan.nextLine());
		String[] names = new String[n];

		System.out.println("Please enter the names one by one");
		for (int i = 0; i<n; i++)			
			names[i] =  scan.nextLine();									
		
		for(int i = 0; i<n; i++)
			System.out.println(names[i]);	
		
		for(int i = n - 1; i>=0; i--)
			System.out.println(names[i]);





	}

}
