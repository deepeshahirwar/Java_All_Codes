#include<iostream>//merge sort  
#include<bits/stdc++.h>//problem ->8 
using namespace std;  
 
 void merge(int arr[],int s,int e){ 
    int mid=(s+e)/2; 
     
     int len1= mid-s+1; 
     int len2=e-mid; 
      
      int *first = new int [len1];//dynamically memory allocet 
      int *second = new int [len2]; 
      int mainArrayIndex =s; 
      for(int i=0; i<len1; i++){ 
        first[i]=arr[mainArrayIndex++];
      }  
        mainArrayIndex = mid+1;
       for(int i=0; i<len2; i++){ 
        second[i]=arr[mainArrayIndex++];
      }  
      //merge 2 sorted array 
      int Index1=0;
      int Index2=0; 
      mainArrayIndex=s; 
       
       while(Index1 < len1 && Index2 < len2){  
        if(first[Index1] < second[Index2]){
        arr[mainArrayIndex++] = first[Index1++];
       } 
       else{ 
        arr[mainArrayIndex++] = second[Index2++];
       }
 }  
  
  while(Index1 < len1){ 
    arr[mainArrayIndex++] = first[Index1++];
  } 
  while(Index1 < len2){ 
    arr[mainArrayIndex++] = second[Index2++];
  }
 }
void divide(int arr[],int s, int e ){ 
    //base cace 
    int mid=(s+e)/2; 
    if(s>=e){ 
        return ;
    }  
    //left part sort karna hai 
    divide(arr,s,mid); 
    //right part sort karna hai 
divide(arr,mid+1,e);  
//for merge
merge(arr,s,e);
} 
 int main(){ 
    int arr[9]={3,1,7,2,0,911,143,45,665}; 
    int n=9;  
   // merge(arr,0,n-1);
    divide(arr,0,n-1);//fun call  
    //for print 
    cout<<" merge sorted array is:"; 
    for(int i=0; i<n; i++ ){ 
        cout<<arr[i]<<" ";
    }cout<<endl;
return 0;
  }//o/p->0 1 2 3 7.......665