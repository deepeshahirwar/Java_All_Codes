class ArraySum{ 
    public static void main(String[]s){ 
        int []nums={2,7,11,15}; 
        for(int i=0;i<nums.length;i++){ 
            for(int j=i+1;j<nums.length;j++){ 
            if(nums[i]+nums[j]==17){  

                System.out.print("["+i+" "+j+"]"); 
                break;
            } 
            
    
            }
    
    }
} 
}