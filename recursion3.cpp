 //key present or not in array
 #include<iostream> //problem ->5
using namespace std; 
/*bool liSearsh(int arr[],int size,int k){ 
    //base case 
    if(size==0){ 
        return false;  
    } 
    if(arr[0]==k){ 
        return true;
    } 
    else { 
        bool remainingPart = liSearsh(arr+1,size-1,k);  
        return remainingPart;
    }
} 
int main(){  
    int arr[5] = {3,5,1,8,4};  
    int size = 5; 
    int k = 8; 
    bool ans = liSearsh(arr,size,k); 
    if(ans){ 
        cout<<" key present "<<endl; 
    }  
    else { 
        cout<<" key is not present"<<endl;
    } 
    return 0;

}*/ 
  
   void print(int arr[],int low, int high){//find key value using ricursion 
    for(int i=low; i<=high; i++){ //problem->5
        cout<<arr[i]<<" ";
    }cout<<endl;
   }
   bool binarySearch(int arr[],int low,int high,int key){ 
cout<<endl;
     print (arr,low,high);
    int mid=low+(high-low)/2;   
    //base case
    if(low>high) 
    return false;  
    cout<<"elment found or not:"<<arr[mid]<<endl;
    if(arr[mid]==key) 
    return true; 
 
    if(arr[mid]<key){ 
        return binarySearch(arr,mid+1,high,key);
    } 
    else{ 
        return binarySearch(arr,low,mid-1,key);
    } 
     
   } 
   int main(){ 
    int arr[8]={ 2,3,5,7,9,12,45,55}; 
    int size =8; 
    int key=5; 
    cout<<binarySearch(arr,0,7,key); 

   }