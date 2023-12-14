public class Adder{  
    static int add(int a,int b){ 
        return a+b;
    }  
    static double add(int a,int b){ 
        return a+b;
    } 
}
    public class MainPoly{
    public static void main(String[] args) {
        System.out.println(Adder.add(2,4)); 
     
    } 
} // this code will give compile time error  , becuase ambiguit y problem
