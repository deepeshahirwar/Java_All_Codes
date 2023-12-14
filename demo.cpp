 //Recursion prectic 1
 #include<iostream> 
using namespace std; 
 fun(int n){
    if(n==0){  
        return 1; 
    } 
     else{  
         
      return n*fac(n-1); 
      cout<<fac(n)<<" "; 
    } 

         
 } 
int main(){ 
    fun(5); 

} 
