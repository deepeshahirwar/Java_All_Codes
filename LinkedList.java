public class LinkedList {  
   public static class Node{ 
        int data; 
        Node next; 
      public  Node(int data){ 
            this.data = data; 
            this.next = null;
        }
    }  
    public static Node head; 
    public static Node tail; 
 
    //addFirst 
    public void addFirst(int data){ 
    //step 1 create newNode 
    Node  newNode = new Node(data);  
    //when ll is null 
    if(head == null ){ 
        head = tail = newNode; 
        return;
    } 
    
    //step 2 newNode next = head
    newNode.next = head; 
    head = newNode;  
    
    } 
   // addLast  
    public void addLast(int data){ 
        //step 1 create newNode 
        Node  newNode = new Node(data);  
        //when ll is null 
        if(head == null ){ 
            head = tail = newNode; 
            return;
        } 
        
        //step 2 newNode next = head
        tail.next = newNode; 
        tail = newNode;  
    }  
        
   //for printing ll 
    public void print(){  
    
        Node temp = head ;  
        
        while( temp != null){  
            
            System.out.print(temp.data+"->"); 
            temp = temp.next;  
          
        } 
        //for ll is null 
        System.out.println("null");
    }
public static void main(String []args){ 
LinkedList ll = new LinkedList(); 
//addfirst 
ll.addFirst(2); 
ll.addFirst(1);  
 
//addlast
 ll.addLast(3); 
 ll.addLast(4); 
  
 //print 
 ll.print();
}
    
}
