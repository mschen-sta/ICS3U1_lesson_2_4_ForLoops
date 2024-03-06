/**
* A program that counts down from 10 to 0
* @author: E. Fabroa
*
*/
public class CountDown10 extends ConsoleProgram {

   public void run() {
       for (int counter = 10;  counter >= 0; counter-- ) {

           System.out.println(counter);
       }
   }
}