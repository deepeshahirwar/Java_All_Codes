#include<iostream> 
#include<unordered_set>
using namespace std; 
int main(){ 
   /* unordered_set<int> s; 
    s.insert(5); 
    s.insert(15); 
    s.insert(25); 
    if(s.find(5)==s.end()) 
        cout<<"not found"<<endl; 
        else 
        cout<<"found"<<endl; 
    cout<<endl;
         for(auto it=s.begin(); it!=s.end(); it++) 
            cout<<(*it)<<" "; 
           // s.clear(); 
            cout<<"sise is: "<<s.size()<<endl;
         s.erase(s.begin(),s.end());//all element deleted
    
    return 0;*/  
     
      unordered_set<int> s; //
    s.insert(5); 
    s.insert(15); 
    s.insert(25); 
    s.insert(15); 
    if(s.count(10)==0) 
        cout<<"not found"<<endl; 
        else 
        cout<<" found"<<endl; 
       for(auto it=s.begin(); it!= s.end(); it++ ) 
       cout<<(*it)<<endl; 
//deleted 10 
            cout<<"sise is: "<<s.size()<<endl;
        // s.erase(s.begin(),s.end());//all element deleted
    
    return 0;
}