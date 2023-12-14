class Array2d{
    public static void main(String[]a){ 
        int[][]arr={{4,5,6,12}, 
                    {1,2,3,4}}; 
                    //int[][]num={{4,5,6,7}, 
                              // {0,0,0,}};  
                              for (int i=0;i<2;i++){ 
                                for(int j=0;j<4;j++){  
                                    for (int n=0;n<2;n++){  
                                        for(int m=0;m<4;m++){ 
                                            if(arr[i][j]+arr[n][m]==13){ 
                                                System.out.println(i+" "+j+" ");
                                            }   
                                           // System.out.println();
                                        }
                                    }    
                                    }   
                                } 
                                System.out.println();
                              }             
                    
    }
