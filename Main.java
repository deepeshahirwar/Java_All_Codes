class Main3{ 
    static void show(int a,char c){ 
        System.out.println("int number is ="+a); 
        System.out.println("char number is ="+c);
    }
 
static void show(char c,int a){  
    System.out.println("int number is ="+c); 
    System.out.println("char number is ="+a);
} 
public static void main(String[]args){ 
    show(2,'A'); 
    show('B',4);
} 
}