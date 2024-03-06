
# 2.4 For Loops

Until now, if we wanted to repeat code, we would have to copy and paste it.

A simple example:


```
    public class SimpleRepetition extends ConsoleProgram {
       public void run() {
           System.out.println( "Another joke?" );
           System.out.println( "Another joke?" );
           System.out.println( "Another joke?" );
       }
    }
```



## The For Loop


```
    public class ForLoopDemo extends ConsoleProgram {

       public void run() {
           for( int counter = 0; counter < 3; counter++ ){
               System.out.println("Another joke?");
           }
       }
    }
```



### For Loop Structure


```
    for( <initialize count; <continue condition>; <update count> ){
       //indented statements…
    }
```



#### Common For loop Structure Errors


```
// incorrect opening
for( int counter = 0; counter < REPEAT; counter++ );
    		System.out.println( "Hello World!" );
    }

// empty loop
for( int counter = 0; counter < REPEAT; counter++ ){
}
```



### Example 1 - Counting Up


```
/**
* A program that counts up from 0 to 10
* @author: E. Fabroa
*
*/

public class CountUp10 extends ConsoleProgram {

   public void run() {
       for (int counter = 0; counter <= 10; counter++  )  {
           System.out.println(counter);
       }
   }
}
```



###  Example 2 - Counting Down
```
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
```



###  Example 3 - Summing Values


```
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
               total += add;  //add to total?
           }
           System.out.println( "The total sum is: " + total );
       }
    }
