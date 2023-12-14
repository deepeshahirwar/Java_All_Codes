#include<iostream>  
#include<bits/stdc++.h> 
using namespace std; 
#include<vector> 
int main(){ 

   //vector<int> v = new vector;//dynamically     
  vector<int> v1 ; //ststically
      v1.push_back(50);  
      v1.push_back(10);  
      v1.push_back(45);  
       v1.push_back(30); 

        
       //reverse(v1.begin(),v1.end());
        
     sort(v1.begin(),v1.end());

   /* for(int i = 0; i< v.size(); i++){ 
        cout<<v[i]<<endl;
    }*/  
cout<<"sorted vector is :"<<endl;
     for(auto it = v1.begin(); it!=v1.end(); it++){ 
        cout<<(*it)<<endl;
     } 
     
}