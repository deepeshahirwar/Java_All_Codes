 //incersion operation in array
 #include <iostream> 
 #include <bits/stdc++.h> 
using namespace std; 
 /*void printArray(int a[],int n){ 
    for(int i=0;i<n;i++){ 
        cout<<a[i]<<" ";
    }
} 
int main(){ 
    int a[4]; 
    int n=4; 
  for(int i=1;i<5;i++){ 
    a[i-1]=i*2;
  } 
  printArray(a,n);
}*/ 
//deletion in stack element 
void printStack(stack<int> St){ 
    //travers in stack  
    while(!St.empty()){ 
        //print top elemet 

    cout<<St.top()<<" ";  
    //pop top element 
    St.pop(); 
    }
} 
int main(){ 
    //initialise stack 
stack<int> St; 
//insert element in stack 
St.push(4); 
St.push(3); 
//St.push(2); 
//St.push(1); 
//print element before the pop 
//operation on stack 
printStack(St); 
cout<<endl; 
//pop the top element 
//St.pop(); 
St.pop(); 
//print element after pop; 
printStack(St); 

}