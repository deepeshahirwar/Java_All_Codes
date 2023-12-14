#include<iostream>  
#include<bits/stdc++.h> 
using namespace std; 
#include<array> 
int main(){ 

   //Basic array 
   //int arr [] = {2,3,4,5,6}; 
   //STL array is 
   array<int , 5> a = {2,3,4,5,6}; //its all operatoin only ->O(1)
    int size = a.size(); 
     
     for(int i=0; i<size; i++){ 
        cout<<a[i]<<" "<<endl;
     } 
      
      cout<<" at 2nd index element :"<<a.at(2)<<endl; 
      cout<<" array empty or not "<<a.empty()<<endl; 
 
 cout<<"  first element "<<a.front()<<endl; 
 cout<<"  last  element "<<a.back()<<endl;

}