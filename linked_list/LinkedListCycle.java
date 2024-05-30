package linked_list;

public class LinkedListCycle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {
        Node previous = head;
        Node current = head;

        while (current != null && current.next != null) {
            previous = previous.next;
            current = current.next.next;

            // If both pointers meet at one point, there is a cycle
            if (previous == current) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListCycle l1 = new LinkedListCycle();

        // Create a linked list with a cycle
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2; // Creates a cycle linking back to n2

        System.out.println("Cycle detected: " + hasCycle(n1)); // Output: true

        // Create a linked list without a cycle
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);

        n5.next = n6;
        n6.next = n7;
        n7.next = n8;

        System.out.println("Cycle detected: " + hasCycle(n5)); // Output: false
    }
}
