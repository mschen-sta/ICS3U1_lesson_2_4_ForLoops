
# 2.4 For Loops

Until now, if we wanted to repeat code, we would have to copy and paste it.

A simple example:


```java
public class SimpleRepetition extends ConsoleProgram {

    public void run() {
        System.out.println("Another joke?");
        System.out.println("Another joke?");
        System.out.println("Another joke?");
    }
}
```



## The For Loop


```java
public class ForLoopDemo extends ConsoleProgram {

    public void run() {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println(counter);
            System.out.println("Another joke?");
        }
    }
}
```



### For Loop Structure


```java
for (<initialize count>; <continue condition>; <update count>) {
    // Indented statements
}
```



#### Common For loop Structure Errors


```java
// Incorrect opening (missing {})
for (int counter = 0; counter < Num; counter++);
    System.out.println( "Hello World!" );

// Empty loop
for (int counter = 0; counter < num; counter++) {
}

// Condition will never be true
for (int counter = 0; counter > 10; counter++) {
    System.out.println(counter);
}
```



### Example 1 - Counting Up


```java
/**
* A program that counts up from 0 to 10
* @author: E. Fabroa
*/

public class CountUp10 extends ConsoleProgram {

   public void run() {
       for (int counter = 0; counter <= 10; counter++) {
           System.out.println(counter);
       }
   }
}
```



###  Example 2 - Counting Down
```java
/**
* A program that counts down from 10 to 0
* @author: E. Fabroa
*/

public class CountDown10 extends ConsoleProgram {

   public void run() {
       for (int counter = 10;  counter >= 0; counter--) {

           System.out.println(counter);
       }
   }
}
```



###  Example 3 - Summing intValues


```java
/**
* A program that sums up intValues entered by the user
* @author: E. Fabroa
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
