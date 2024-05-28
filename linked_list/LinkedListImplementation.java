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
    public static void main(String[] args){
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.insertElementAtBeginning(5);
        ll.insertElementAtBeginning(4);
        ll.insertElementAtBeginning(3);
        ll.insertElementAtBeginning(2);
        ll.insertElementAtBeginning(1);
        ll.display();

        System.out.println("Insert new Element at the End");
        ll.insertAtEnd(6);
        ll.display();
    }
}
