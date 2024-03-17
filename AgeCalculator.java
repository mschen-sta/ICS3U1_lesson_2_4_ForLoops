/**
* A program that calculates the user's age
* @author: C. Chen
*/

public class AgeCalculator extends ConsoleProgram {
	public void run() {
        // Declare variables
		int intCurrentYear;
		int intBirthYear;
		int intAge;

		// Ask user for current and birth year
		intCurrentYear = readInt("What is the current year? ");
		intBirthYear = readInt("What is your birth year? ");
		
		// Calculate their age
		intAge = intCurrentYear - intBirthYear;

		// Tell the user their age
		System.out.println("Your age this year is " + intAge);
	}
}
