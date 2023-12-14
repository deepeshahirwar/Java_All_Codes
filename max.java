public class max { 
    
        public static void main(String[] args) { 
            int a[]={4,6,1,5,3,7,4,9}; 
            int min=a[0];  
             int max=a[0]; 
            for(int i=1;i<a.length;i++){ 
                if(a[i]<min){ 
                    min=a[i]; 
                } 
            }
                     for(int i=1;i<a.length;i++){ 
                    if(a[i]>max){ 
                    max=a[i]; 
                    }
                } 
            int sum=max +min;
           // if(a[i]==max)
              //  return; 
            
            System.out.println("sum is :"+sum);
        }
    }
    

