/**
* A program that prints all the odd numbers from 1 to 15.
* @author: C. Chen
*/

public class Odds extends ConsoleProgram {
	public void run() {
		for (int counter = 1; counter <= 15; counter += 2) {
			System.out.println(counter);
		}
	}
}