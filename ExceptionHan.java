public class ExceptionHan {   
    //declaring final variable  
    final int age = 18;   
    void display(){ 
        System.out.println(age); 
        age = 25; 
        //it will give compile time  error 
        //cannot assign a value to final variable age
        //age = 25; 
    }  
    public static void main(String[] args) {
        ExceptionHan  obj = new ExceptionHan (); 
        obj.ExceptionHan();  
     
    }
    
}
