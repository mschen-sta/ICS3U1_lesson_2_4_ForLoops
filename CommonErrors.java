class CommonErrors extends ConsoleProgram {

  /**
  * Common errors with for loops
  * @author: C. Chen
  */
  
  public void run() {
    
    // Condition will never be true. This loop will never run
    for (int counter = 0; counter > 10; counter++) {
      System.out.println(counter);
    }

    // // Condition will always be true, hence, the loop never ends
    // for (int counter = 0; counter >= 0; counter++) {
    //   System.out.println(counter);
    // }
    
  }
}