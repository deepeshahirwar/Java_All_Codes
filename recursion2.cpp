#include<iostream> //lecture -. 2
using namespace std;//problem-> 2  
/*void target(int home ,int college){ 
    cout<<"home:"<<home<<" "<<"college:"<<college<<endl; 
    if(home==college){ 
        cout<<"college puhuch gaya "<<endl; 
        return ;
    }  
   // home++;
target(home+1 ,college);
}
int main(){  
//int home=1; 
//int college=10; 
target(1 ,10);

}*/ 
/* void sayDigit(int n,string arr[]){//problem->3 
    //base case 
    if(n==0) 
    return ; 
    //processing 
    int digit=n % 10; 
    n=n / 10; 
   // cout<<arr[digit]<<" "; 
    sayDigit(n,arr);  
    cout<<arr[digit]<<" "; 

 }
int main(){   
    string arr[10]= {"zero","one","two","three", 
                "four","five","six", 
               "seven","eight","nine"};
    int n; 
    cin>>n; 
    cout<<endl; 
   sayDigit(n,arr); 
    cout<<endl; 

return 0;
}*/ 
/*bool isSorted(int arr[],int size){//problem->4 
    //base case 
    if(size==0||size==1){ 
        return true; 
    } 
    if(arr[0]>arr[1]) 
        return false;
     
    else  { 
        bool remainigPart=isSorted(arr + 1,size - 1); 
        return remainigPart ; 
    }
} 
int main(){  
    int arr[5]= {1,2,3,4,5}; 
    int size=5;  
    bool ans= isSorted(arr,size); 
    if(ans){ 
        cout<<"Array is sorted "<<endl;  
    }
        else{ 
            cout<<"Array is unsorted"<<endl;
        } 
        return 0;
    
}*/   
 
 //sum of array by using recursion
 int  ArraySum(int arr[],int size){//problem->5 
    //base case 
    if(size==0) 
    return 0; 
    if(size==1) 
    return arr[0]; 
 int remainigPart = ArraySum(arr+1,size-1);  
 int sum = arr[0]+remainigPart; 
 return sum;
 } 
 int main(){ 
    int arr[5]={1,2,3,4,5}; 
    int size=5; 
   // ArraySum(arr,size); 
    int sum=ArraySum(arr,size); 
    cout<<"sum is:"<<sum;
 }
