class Searching{ 
    public static int binarySearch(int a[],int key){ 
        int low=0;int high=a.length-1;
        while(low<=high){ 
            int mid=(low+high)/2; 
            if(a[mid]==key){ 
                return mid;
            } 
            else if(a[mid]<key){  
                low=mid+1;
            } 
            else{ 
                high=mid-1;
            }
        } 
        return -1;//for key not found
    } 
    public static void main(String []afd){ 
        int a[]={3,5,7,9,11,23,45,78}; 
        int key=78;  
       System.out.print("key present at index:"+binarySearch(a,key));
    }
}