/**
* A program that sums up values entered by the user
* @author: E. Fabroa
*
*/
public class SummingValues extends ConsoleProgram {

    public void run() {

        int values = readInt(("How many values do you have?"));
        double total = 0; //start at zero
        double add;

        for( int count = 0; count < values; count++ ) {
            System.out.println("Sum so far is: " + total + "\n");
            add = readDouble("Enter the next value: ");
            //total += add;  //add to total
            total = total + add;
        }
        System.out.println( "The total sum is: " + total );
    }
}