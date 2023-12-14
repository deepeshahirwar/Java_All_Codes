class PatternOne{ 
    public static void main(String[]args){  
       /*  for(int i=5; i>=1; i--){//for row 
            for(int j=1; j<=5-i; j++){ 
                System.out.print(" "); 
            } 
            for(int j=1; j<=i; j++){ //for column
                System.out.print("*"+" ");
            }  
            System.out.println(); 
        } 
        //for reverse 
        for(int i=1; i<=5; i++){//for row 
            for(int j=1; j<=5-i; j++){ 
                System.out.print(" "); 
            } 
            for(int j=1; j<=i; j++){ //for column
                System.out.print("*"+" ");
            }  
            System.out.println(); 
        }  */  
        /*int number =1;
        for(int i=1; i<=5; i++){//for row 
            for(int j=1; j<=i; j++){ //for column
                System.out.print(number+" "); 
                number++; 
            }  
            System.out.println();
        } */ 
        for(int i=5; i>=1; i--){//for row   
                for(int j=1; j<=i; j++){
                int sum= i+j; 
                if(sum%2==0) 
                System.out.print("1"+" "); 
                else 
                System.out.print("0"+" ");  
            }  
            System.out.println(); 
        }
        }  
    }  
    
    
