#include<iostream> 
using namespace std; //node create

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
int main(){ 
    //created anode new node  
    Node* node1 = new Node(10); 
   // cout<<"data is: "<<node1 -> data <<endl;
    //cout<<"address is: "<<node1 -> next <<endl; 
    //head pointed to node1 
    Node* head = node1; 
    Node* tail = node1;  
    print(head); 

     insertAttail(tail,12); 

      print(head); 
 insertAttail(tail,15); 

      print(head); 

}