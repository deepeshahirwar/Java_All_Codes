#include<iostream> //promblem->6
using namespace std; //print reverse string
/*void reverse(string& str,int i,int j){  
    cout<<" call recieved for" << str <<endl;
    //base case    (&->for referance variable) 
    if(i>j) 
    return ; 
    swap(str[i],str[j]);//swaping  
    i++; 
 j--;
    reverse(str,i,j);//rec call
} 
int main(){  
    string name  =" ABCDE ";  
reverse(name ,0,name.length()-1); 
cout<<name<<endl; 

return 0;
}*/ 
 //problem->7
 /*bool checkPalindrome(string& str,int i,int j){//ckeck palindrome string  
    cout<<" call recieved for" << str <<endl;
    //base case    (&->for referance variable) 
    if(i>j) 
    return true; 
    if(str[i]!=str[j])//swaping  
     return false; 
     else //rec call
     return  checkPalindrome(str,i+1,j-1);
} 
int main(){  
    string name  =" ABCBA "; 
    cout<<endl;  
bool ans=checkPalindrome(name ,0,name.length()-1); 
if(ans) 
cout<<"its a palindrome:"<<endl; 
else 
cout<<"its a not palindrome :"<<endl;  
cout<<name<<endl;
return 0;
}*/ 
 //find(a^b)
 /*int power(int a,int b){ 
    if(b==0) //base case
    return 1; 
    if(b==1) 
    return a; 
     //recursive call
     int ans = power(a,b/2); 
     if(b%2==0)//if b is even 
     return ans*ans; 
     else //if b is odd
     return a*ans*ans; 
 } 
 int main(){ 
    cout<<"inter your number:"; 
    int a,b; 
    cin>>a>>b;  
    cout<<endl;
   int ans = power(a,b); 
   cout<<"answer is:"<<ans<<endl; 

    return 0; 
 }*/ 
  
  //bubble sort 
  void sortArray(int arr[],int n){ 
    //base case -already sorted hoga
    if(n==0||n==1) 
return ; 

 for(int i=0; i<n-1; i++){ 
    if(arr[i]>arr[i+1]){ 
        swap(arr[i],arr[i+1]);
    }
 } 
 //recursive call 
 sortArray(arr,n-1);   
  } 
  int main(){ 
    int arr[5]={3,10,7,2,9}; 
    sortArray(arr,5);//fun call  
    //for print 
    cout<<"sorted array is:"; 
    for(int i=0; i<5; i++ ){ 
        cout<<arr[i]<<" ";
    }

  }//o/p->0 1 2 3 7