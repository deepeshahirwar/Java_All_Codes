
 class Atm{ 
    public static void main(String[]args){ 
     
        System.out.println("welcome in amt");   
        int balence=500; 
        int password=7987; 
        int acountNum=8; 
        int result; 
        switch(1){ 
            case 1: result= acountNum; 
            System.out.println(result); 
            break;
            case 2: result= password; 
            System.out.println(result); 
            break; 
            case 3: result= balence; 
            System.out.println(result); 
            break; 
            default: 
            System.out.println("invailid passward"); 
        }
    }
}