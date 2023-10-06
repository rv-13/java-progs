package linkedlist;

public class IsCircularOrNot {
    public static void main(String[] args) {
        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        System.out.println(isCircular(head) ? "yes\n" : "No\n");

        head.next.next.next.next = head;
        System.out.println(isCircular(head) ? "Yes\n" : "No\n");


    }

    static class Node {
        int data;
        Node next;
    }

    static boolean isCircular(Node head) {
        if (head == null) {
            return true;
        }
        Node node = head.next;

        while (node != null && node != head)
            node = node.next;

        return node == head;

    }

    //New Node utility
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;

    }
}
