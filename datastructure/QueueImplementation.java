package datastructure;

public class QueueImplementation{
    class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    private Node front;
    private Node rear;
    QueueImplementation(){
        //intially both pointings to null
        front = null;
        rear = null;
    }
    boolean isEmpty(){
        return(front == null);
    }
    void enqueue(int data) {
        // Create a new node with the given data
        Node temp = new Node(data);

        // If both front and rear are null, the queue is empty
        if (front == null && rear == null) {
            // Set both front and rear to point to the new node
            front = temp;
            rear = front;
        } else {
            // If the queue is not empty, add the new node to the rear of the queue
            rear.next = temp; // Set the next reference of the current rear node to the new node
            rear = rear.next; // Move the rear pointer to the new node
        }
    }
    int dequeue(){
        Node temp = front;
        front = front.next;
        temp.next = null;
        if(front == null){
            rear = null;
        }
        return temp.data;
    }
    //method to print the data
    void displayElement(){
        Node current = front;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args){
        QueueImplementation queue = new QueueImplementation();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Queue Element ");
        queue.displayElement();

        System.out.println("*************************************************");
        int dequeueElement = queue.dequeue();
        System.out.println(" Display Dequeue Element : " + dequeueElement);
    }
}