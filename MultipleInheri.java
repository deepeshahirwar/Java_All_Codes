public class MultipleInheri { 
    public static void main(String[] args) {
        C  obj = new C(); 
       int rus1 = obj.add(2,5,2); 
        obj.show2();
        
       System.out.println(rus1);
    }
}  
//parent1
class A{  
    int show1(){ 
        System.out.println("i am show1 :"); 
        return 0;
    } 
    int add(int a, int b){ 
        return a+b; 
    } 
} 
//parent2 
class B{ 
    int show2(){ 
        System.out.println("i am show2 :"); 
        return 0;
    } 
    int add(int a, int b,int c){ 
        return a+b+c; 
    }  

}  
class C extends B{ 

} 
//it will work 

//child
// class C extends A,B{  
//     void show3(){ 
//         System.out.println(" i am show3 :");
//     }

// } error 
/*becuase java not support multiple inheritance */


