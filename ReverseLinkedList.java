public class ReverseLinkedList {
    Node head;

    private static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void printReverse(Node head) {
        //base case - we only want to start printing after this reaches the base case
        if(head == null) {
            return;
        }
        //prints it in reverse because it goes back up the call stack.
        printReverse(head.next);
        System.out.println(head.data + " ");
    }


    //pushes item to the front of the linkedlist
    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }


}
