 #include<iostream> 
 using namespace std; 
 int main(){ 
//     int *ptr; 
//     int value = 11; 
//     ptr = &value; 
//    std:: cout<<"print value of the hold pointer :"<<*ptr <<endl; 
//    cout<<"print address of the value :"<<ptr; 
int arr[5] ={1,2,3,4,5} ; 
int *ptr; 
ptr = &arr[3]; 
for(int i=0; i<5; i++){  
    ptr = &arr[i];
    cout<<ptr<<" :"<<*ptr<<endl;
} 
   return 0;
 }