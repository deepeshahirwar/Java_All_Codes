 //method overriding
 class C{ 
    int sum(int n1, int n2){ 
        return n1+n2;
    }
} 
class D extends C{ 
    int sum(int n1, int n2){ 
        return n1+n2+1;
    }
}
 public class MethodOverri4 { 
    public static void main(String[] args) {
        D d = new D(); 
       int ans = d.sum(2,3); 
        
       System.out.println(ans);
    }
    
}
