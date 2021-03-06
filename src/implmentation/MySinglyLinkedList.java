package implmentation;

import myinterface.SinglyLinkedListADT;

public class MySinglyLinkedList implements SinglyLinkedListADT {
    //head or Start of linked list, this will refer to first element
    // of linked list
    private Node head;
    //tail or end  of linked list, this will refer to last element
    // of linked list
    private Node tail;
    //total number of elements in linked list
    private int size;
    //constructor
    public MySinglyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    //metrhod to check if linkded list is empty
    @Override
    public boolean isEmpty(){
        return head == null;
    }
    //to get the number of element in linked list
    @Override
    public int size(){
        return size;
    }
    //adding element at head
    @Override
    public void addFirst(int element){
        //create a node
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
        }
        else{
            node.setNext(head);
            head = node;
            size++;
        }
    }
    //adding last element
    //adding at end
    //insertAtTail
    @Override
    public void addLast(int element){
        Node node = new Node(element);
        //for special case list is empty
        if(isEmpty()){
            head = node;
            tail = node;
            //addFirst(element)
            size++;
        }
        else{
            tail.setNext(node);
            tail = node;
            size++;
        }
    }
    @Override
    //traversing the linked list
    public void traverse(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.getData() + "-->");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
    @Override
    public int removeFirst(){
        //special case. when list is empty
        if(isEmpty()){
            return -1;//using -1 for, considering as invalid data
        }
         else{
              Node response = head;
            //specail case, when only a single node
             if(head == tail){
                   
                    head = null;
                    tail = null;
                    size--;
                    
             }
             else{
                
                 head = head.getNext();
                 size--;
             }
             return response.getData();
         }
        
    }
    @Override
    public int removeLast(){
        if(isEmpty()){
            return -1;
        }
        else{
            Node temp = head;
            Node previous = null;
            while(temp.getNext() != null ){
                previous = temp;
                temp = temp.getNext();
            }
            //special case if there only a single node
            if(previous == null){
                head = null;
                tail = null;
                size--;
                
            }
            else{
            }
        }
            
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
