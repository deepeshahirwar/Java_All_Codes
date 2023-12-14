 //Array prectice problem 1
 /*class Array3{ 
    public static void main (String[]args){ 
        int [] marks={94,85,79,84,84}; 
        int sum=0; 
       for(int i:marks){ 
           sum +=i; 
       } 
           System.out.print("tthe value of sum is "+sum/marks.length);
       
        
    }
}*/ 
class Array3{ 
    public static void main (String[]args){ 
 /*  int [] marks={94,85,79,84,84}; 
        int num=86; 
        boolean isInArray=false;
       for(int i:marks){ 
           if(i==num){ 
           isInArray=true;
           break; 
       }  
    }if( isInArray){
           System.out.print("the value  is present in array");
    } 
    else{ 
        System.out.print("the value  not present in array"); 
    }*/ 

    //prectice problem in 2D Array 
    //sum 1array into 2Array  
     int[][] mat1={{1,2,3}, 
                  {4,5,6}}; 
     int[][] mat2={{1,2,3}, 
               {4,5,6}}; 
      int[][] result={{0,0,0}, 
                  {0,0,0}}; 
       for(int i=0;i<mat1.length;i++){//for row 
        for(int j=0;j<mat1[i].length;j++){//for colunm 
            System.out.format("\n",i,j);  
            result[i][j]=mat1[i][j]+mat2[i][j];

        } 
       } //for print element in array
       for(int i=0;i<mat1.length;i++){ 
        for(int j=0;j<mat1[i].length;j++){ 
            System.out.print(result[i][j]+" ");  
            result[i][j]=mat1[i][j]+mat2[i][j];

        }  
        System.out.println(""); 
    }                                 
    }
}