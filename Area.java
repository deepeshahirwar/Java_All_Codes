class Area{ //mothod overloading
    static void area1(int s){ 
        System.out.println("area of square is ="+s*s);
    } 
    static void area1(int  l,int b){ 
        System.out.println("area of rectengle is ="+l*b);
   
    }  
    static void area1(float  l,float b){ 
        System.out.println("area of trengle is ="+(l*b)/2); 
    }

    public static void main(String[]args){ 
        area1(10); 
        area1(10,20); 
        area1(5f,10f);
    }  
}
