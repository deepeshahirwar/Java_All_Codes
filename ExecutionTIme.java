 import java.io.*; 
 import java.util.*; 
 import java.lang.*;
 public class ExecutionTIme { 
    public static void main(String[] args) {
        long starting, ending;
        System.out.println("Timing a loop from 0 to 100,000,000");
         
        // time a for loop from 0 to 100,000,000
        starting= System.currentTimeMillis(); // get the starting time
        for(int  i=0;i<100000;i++);
        ending=System.currentTimeMillis(); // get ending time
        System.out.println("Elapsed time: "+(ending-starting));
    }
    
}
