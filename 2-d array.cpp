#include<iostream> 
using namespace std; 
int main(){ 
    // cout<<"array element is : "; 
    char arr[2][7]={{'d','e','e','p','e','s','h'}, 
                   {'b','h','a','i'}}; 
                  // cout<<"array element is : "; 
                   for(int i=0; i<2; i++){//for row 
                     for(int j=0; j<7; j++){//for column 
                    cout<<arr[i][j];
                   } 
                   cout<<"\n";
                   }
}