package linked_list;
public class LinkedListImplementation {
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    private Node head;
    LinkedListImplementation(){
        head = null;
    }
    //insert element at the beginning of the linked-list
    public void insertElementAtBeginning(int data){
        Node newElement = new Node(data);
            newElement.next = head;
            head = newElement;
    }
    //method to display the linkedList
    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    //insert element at the end of the linked list
    public void insertAtEnd(int data){
        //first, we create a new node with value 6
        Node newNode = new Node(data);
        //check if the head of the linked list is null, this means list is empty, and the new node become the head of the linked list
        if (head == null){
            head = newNode;
            return;
        }else{
            //we initialize a pointer current to the head of the list
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            //after this loop current points to the last node
            //insert node at the end
            current.next = newNode;
        }
    }
    //insert node at given position
    public void insertNodeAtGivenPosition(int data, int position){
        //create a new Node
        Node newNode = new Node(8);
        //check if inserting at head, handle insertion at the beginning
        if(position == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        //traverse to the position just before where the new node will be inserted
        for(int i = 0; current != null && i < position - 1; i++){
            current = current.next;
        }
        //if the position is more than the number of nodes, insertion is invalid
        if(current == null){
            System.out.println("position is out of bounds");
            return;
        }
        //insert new node
        newNode.next = current.next;
        current.next = newNode;
    }
    //delete node at the given position of the linked list
    public void deleteNodeAtTheGivenPosition(int data, int position){
        //check if list is empty
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        //if deleting the head node
        if(position == 0){
            head = head.next;
            return;
        }
        Node current = head;
        //traverse the position just before where the node will be deleted
        for(int i = 0;current != null && i < position - 1; i++){
            current = current.next;
        }
        //if the position is more than the number of nodes, deletion is invalid
        if(current == null || current.next == null){
            System.out.println("Position is out of bounds");
            return;
        }
        //delete the node
        current.next = current.next.next;
    }
    public static void main(String[] args){
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.insertElementAtBeginning(5);
        ll.insertElementAtBeginning(4);
        ll.insertElementAtBeginning(3);
        ll.insertElementAtBeginning(2);
        ll.insertElementAtBeginning(1);
        ll.display();

//        System.out.println("Insert new Element at the End");
//        ll.insertAtEnd(6);
//        ll.display();

//        System.out.println("Insert a node at the given position");
//        ll.insertNodeAtGivenPosition(8,2);
//        ll.display();

        System.out.println("Delete the node at the given position");
        ll.deleteNodeAtTheGivenPosition(2,1);
        ll.display();
    }
}
