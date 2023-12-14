#include<iostream> 
using namespace std; 
int main(){ 
    int arr[6]={3,6,14,9,1,10}; 
    int min=0; 
    for(int i=0; i<6;i++){ 
        if(arr[i]>min) 
        min=arr[i];
    } 
    cout<<min; 
    return 0;
}