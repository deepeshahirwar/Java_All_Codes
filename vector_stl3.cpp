#include <iostream> 
#include<vector> 
using namespace std; 
int main(){ 
    vector<int> v; 
      v.push_back(1);
      v.push_back(2); 
      v.push_back(3); 
      v.push_back(4); 

    cout<<v[0]<<endl;
   cout<<v[1]<<endl;
    cout<<v[2]<<endl;
    cout<<v[3]<<endl; 
cout<<endl; 

     for(int i=0; i<v.size(); i++) 
     cout<<v[i]<<endl; 
        
        cout<<endl; 
         
       vector<int>::iterator it; 
       for(it=v.begin(); it!=v.end(); it++) 
cout<<*it<<endl; 
 
 cout<<endl; 
  
  for(int i:v) 
  cout<<i<<endl; 
  cout<<endl; 
   
   for(auto i: v) 
   cout<<i<<endl; 
   cout<<endl; 
    
    

    return 0;
}