/**
* A program that counts up from 0 to a number n
* @author: C. Chen
*/

public class CountUpToN extends ConsoleProgram {
	public void run() {
        // Declare variables
		int intNumberN;
        
        // Get n from user
        intNumberN = readInt("Enter the number n: ");

        // Print out each number from 0 to n
		for (int counter = 0; counter <= intNumberN; counter++) {
			System.out.println(counter);
		}
	}
}