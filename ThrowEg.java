public class ThrowEg { 
    static void chechEligibility(int stuage, int stuweight){
        if(stuage<12 && stuweight<40){
            throw new ArithmeticException("Stuents is not eligible for registration");
        }else{
            System.out.println("Students Entru is Valid");
        }
    }
    public static void main(String args[]){
        System.out.println("Welcome to the Registration process");
        chechEligibility(10, 30);
        System.out.println("Have a nice day");
}

}
