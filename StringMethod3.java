 //Check if Two Strings are Equal
 public class StringMethod3{ 
    public static void main(String[] args) {
         String str1= "deepesh"; 
         String str2= "deepesh";  
        
//compareTo()
//for comparing two Strings  it will give 0
//if string is equals 
int result = str1.compareTo(str2); 

        System.out.println(result);  
           
        //first method 
        //compareTo()
        if(str1.compareTo(str2) == 0){ 
            System.out.println("both are equal ");
        } 
        else{ 
            System.out.println("both are  not equal ");
        } 
        //second method 
        //equals() 
        if(str1.equals(str2) == true ){ 
            System.out.println("both are equal ");  
        }
        else{ 
            System.out.println("both are  not equal ");
        }  
         
        String str3 = "JAVA METHODS";
        String upper =str1.toUpperCase(); 
        String lower =str3.toLowerCase(); 

        System.out.println(upper); 
        System.out.println(lower);

    }
}