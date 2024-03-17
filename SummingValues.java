/**
* User specifies the total amount of values to sum.
* A for loop is used to sum all the values entered by the user.
* @author: C. Chen
*/

public class SummingValues extends ConsoleProgram {

    public void run() {

        int intValues = readInt("How many values do you have? ");
        double dblTotal = 0; // start at zero
        double dblAdd;

        for (int count = 0; count < intValues; count++) {
            System.out.println("Sum so far is: " + dblTotal + "\n");
            dblAdd = readDouble("Enter the next value: ");
            dblTotal = dblTotal + dblAdd;  // add to total
        }

        System.out.println( "\nThe total sum is: " + dblTotal );

    }
}