package datastructure;
//this is a stack implementation using java
public class StackImplementation {
    class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null; // by default null
        }
    }

    private Node top;

    StackImplementation() {
        top = null;
    }

    void push(int x) {
        Node temp = new Node(x);
        if (top == null) {
            top = temp;
        } else {
            temp.next = top;
            top = temp;
        }
    }
    //mrthod to pop the element
    int pop(){
        if(top == null){
            return -1;
        }else{
            Node temp = top;
            top = top.next;
            temp.next = null;
            return temp.data;
        }
    }
    boolean isEmpty(){
        return(top == null);
    }
    //method to peek the element means get last pushed data
    int peek(){
        if(top == null) return -1;
        return top.data;
    }
    void display() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack elements
        System.out.println("Stack elements:");
        stack.display();

        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the stack elements after popping
        System.out.println("Stack elements after popping:");
        stack.display();

        //display last pushed data
        int peekData = stack.peek();
        System.out.println("Peek Element : " + peekData);
    }
}
