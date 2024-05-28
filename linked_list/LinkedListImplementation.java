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
    public static void main(String[] args){
        LinkedListImplementation ll = new LinkedListImplementation();
        ll.insertElementAtBeginning(3);
        ll.insertElementAtBeginning(2);
        ll.insertElementAtBeginning(1);
        ll.display();
    }
}
