#include <iostream> //find factorial of n 
using namespace std; //problem 1
/*int factorial(int n){ 
    if(n==0) //base condition
    return 1; 
 int fact=factorial(n-1); 
 int fact1=n*fact; 
    return fact1;//proccess 
   // cout<<fact1<<endl; 
    
} 
int main(){ 
    cout<<"enter your number :";  
    int n;cin>>n;
    int ans =factorial(n); 
    cout<<ans<<endl; 
    return 0;
} */

/*int number(int n){ //problem 2
    if(n==0) //base condition
    return 0; 
     cout<<n<<endl;         
 number(n-1);  
  //cout<<n<<endl;  
} 
int main(){ 
    cout<<"enter your number :";  
    int n;cin>>n;
    number(n); 
   // cout<<ans<<endl; 
    return 0;
} */


int power(int n){//problem 3 
    if(n==0) //base condition
    return 1; 
    // cout<<n<<endl;         
 return 2*power(n-1);  
  //cout<<n<<endl;  
} 
int main(){   

cout<<"enter your number :";  
    int n;cin>>n;
   int ans= power(n); 
    cout<<ans<<endl; 
    return 0;
}