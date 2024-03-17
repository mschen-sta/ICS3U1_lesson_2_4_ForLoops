/**
* A program to sum all numbers up to n
* (e.g. n = 5 then sum = 1 + 2 + 3 + 4 + 5 = 15)
* @author: C. Chen
*/

public class SumN extends ConsoleProgram {

   public void run() {

      int n = readInt("Enter n: " );
      int sum = 0;

      for (int i = 1; i <= n; i++){
         sum = sum + i;
      }
      
      System.out.println("The sum from 1 to " + n + " is " + sum);

   }
}
