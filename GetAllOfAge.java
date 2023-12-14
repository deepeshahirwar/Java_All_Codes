 class Grand_father{ 
      int get_age(){ 
       // System.out.println("Grand_father age is :"+a); 
        return 80;
    }
} 
  class My_father extends Grand_father{ 
  int get_age(){ 
       // System.out.println("my_father age is :"+b); 
        return 60;
    }
} 
 class My_sister extends Grand_father{ 
      int get_age(){ 
      //  System.out.println("Grand_father age is :"+c); 
        return 30;
    }
} 
 class Me extends Grand_father { 
      int get_age(){ 
       // System.out.println("Grand_father age is :"+d); 
        return 20;
    }
} 
 class GetAllOfAge{ 
    public static void main(String[]arg){  
        //create all class  of object
         Grand_father obj1 =new Grand_father(); 
        My_father  obj2 =new My_father (); 
        My_sister obj3 =new My_sister(); 
        Me obj4 =new Me();  

       //call all method insude the all classes 

       System.out.println(obj1.get_age()); 
       System.out.println(obj2.get_age()); 
       System.out.println(obj3.get_age()); 
       System.out.println(obj4.get_age());
    }
} 
