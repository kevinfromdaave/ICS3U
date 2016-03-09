package appiah;
/**
 * This program tells the user the age that their mother was born, when she conceived a child
 */
import java.util.Scanner;

public class MothersAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int motherAge; // Mother's Age
		int kidAge; // Child's Name
		int motherAgeAtBirth; // Mother's Age when she gave birth
		String motherName;// Mother's Name
		String kidName; //Kid's Name


		System.out.println("Please enter your mother's name");
		motherName = scan.nextLine();
		System.out.println("Please enter your the child's name");
		kidName = scan.nextLine();
		System.out.println("Please enter your mother's age");
		motherAge = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter your kid's age.");
		kidAge = Integer.parseInt(scan.nextLine());

		motherAgeAtBirth = motherAge - kidAge; //Calculation for mother's final age

		System.out.println(motherName + " was " + motherAgeAtBirth + " years old when she had her child " + kidName);
	}

}
