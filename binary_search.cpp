#include<iostream>
using namespace std; 

 int binary_search(int a[],int key ){ 
     int low=0;int high=8-1;
        while(low<=high){ 
            int mid=(low+high)/2; 
            if(a[mid]==key){ 
                return mid;
            } 
            else if(a[mid]<key){  
                low=mid+1;
            } 
            else{ 
                high=mid-1;
            }
        } 
        return -1;//for key not found
    } 
    int main(){  
        int n=8;
        int a[8]={3,5,7,9,11,23,45,78}; 
        int key=11;  
       cout<<"key present at index:"<<binary_search(a,key);
    }
