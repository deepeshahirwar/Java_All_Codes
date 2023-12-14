#include<iostream> //insert in mid element in (ll)
using namespace std; //node create
//head -> first element 
//tail ->last element
 class Node { //element insert(s&e) in linked list
    public: 
    int data; 
    Node* next; 
    // constructer 
    Node(int data){ 
        this -> data = data; 
        this -> next = NULL;
    }
 }; 
 void insertAtHead(Node* &head ,int d){ 
    // new node create  
     Node* temp = new Node(d); 
     temp -> next = head ; 
     head = temp;
 }  
 void insertAttail(Node* &tail ,int d){  
    Node* temp = new Node(d); 
    tail -> next = temp; 
    tail = temp;

 } 
 void print(Node* &head){ 
    Node* temp = head; 
     
     while(temp !=NULL){ 
        cout<<temp ->data << " "; 
        temp = temp ->next;
     } 
     cout<<endl;
 } 
  
  void insertAtPosition(Node* &tail,Node* &head,int position,int d){  
     
     //insert at start 
     if(position == 1){ 
        insertAtHead(head, d); 
        return ;
     }
     
     Node* temp = head; 
     int cnt = 1; 
      
      while(cnt < position - 1){ 
        temp = temp->next; 
        cnt++;
      }  
      //insert at last  
      if(temp ->next == NULL){ 
        insertAttail(tail,d); 
        return ;
      }
       
       //creat new node for d; 
       Node*nodeToInsert = new Node(d); 
       nodeToInsert ->next = temp -> next ; 
       temp ->next = nodeToInsert;
  }
int main(){ 
    //created anode new node  
    Node* node1 = new Node(10);//element 1 
   // cout<<"data is: "<<node1 -> data <<endl;
    //cout<<"address is: "<<node1 -> next <<endl; 
    //head pointed to node1 
    Node* head = node1; 
    Node* tail = node1;  
    print(head);   

     insertAttail(tail,12); //element 2 
      print(head); 

      insertAttail(tail,15);//element 3
      print(head); 

       insertAtPosition(tail,head,4,22);//elment at pos
      print(head);  
  
  cout<<"head "<<head ->data <<endl;
  cout<<"tail "<<tail ->data <<endl;
}