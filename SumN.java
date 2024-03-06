public class SumN extends ConsoleProgram {

   public void run() {

       int n = readInt("Enter n:" );
       int sum = 0;

       for (int i = 1; i <= n; i++){
          sum = sum + i;
          System.out.println(sum);
       }
       System.out.println(sum);

   }
}
