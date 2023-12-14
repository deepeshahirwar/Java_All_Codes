public class sqrt {
    public static void main(String args[]){
        System.out.println(solution.sqrRoot(999.99));

    }
}
class solution{
     static double sqrt(double x){
        return sqrtIter(x,1.0);
        isGoodEnough();
     }
     // define sqrIter
     private static double sqrtIter(double x, double guess){
        if(isGoodEnough(x,guess))
        return guess;
        return sqrtIter(x, improveTheGuess(x, guess));
        // return improveTheGuess(x,guess);
     }
     private static boolean isGoodEnough(double x, double guess){
        double tolerance=1E-9;
           return absolute(guess*guess-x)<tolerance;

     }
      private static double improveTheGuess(double x, double guess){
        return average(guess, x/guess);

      }
      private static double average(double a, double b){
        return (a+b)/2.0;

      }
      private static double absolute(double x){
        if(x<0)
        return -x;
        return x;

      }
}
