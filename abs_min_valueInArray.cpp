#include<bits/stdc++.h>
using namespace std;
int main(){ 
    int t; 
    cin>>t; 
   // int m;
    while(t-->0){ 
   int n; 
   cin>>n; 
   int a[n]; int i,j; 
  // long long min =0; 
  int m=0,c=0;
  vector <int> min;
   for(int i=0;i<n; i++){ 
       cin>>a[i];}
   // sort(a,a+n);
  for(int i=0; i<n; i++){ 
for(int j=i+1; j<n; j++){  
   min.push_back(abs(a[i]-a[j]));
    } 
  } 
    
    cout<<*min_element(min.begin(),min.end())<<endl;
    }
   
    return 0;
}





