#include<iostream> 
#include<list> 
using namespace std; 
int main(){ 
     
     list<int> l; 
     l.push_back(1); 
     l.push_front(2); 
     l.push_front(3); 
 cout<<"list 1 element is: ";
 for(int i : l){ //print list 1
        cout<<i<<" ";
      }cout<<endl; 

cout<<"list l2 element is: ";
      list <int> l2(l);//for copy 
     for(int i : l2){ 
        cout<<i<<" ";
      }cout<<endl;   
 
 cout<<" list size :"<<l.size()<<endl;

       l.erase(l.begin()); 
         for(int i : l){ 
        cout<<i<<" ";
      }cout<<endl;  
       
       cout<<" list size :"<<l.size()<<endl;
}