import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    void add(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }
}

public class pr142CompreTwoLL {
    public static int compareLL(Node t1, Node t2, int size) {

        for (int i = 0; i < size; i++) {
            // System.out.println(t1.data + " " + t2.data);
            if (t1.data != t2.data) {
                return 0;
            }
            t1 = t1.next;
            t2 = t2.next;
        }

        return 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            l2.add(sc.nextInt());
        }
        if (n != m) {
            System.out.println(0);
            return;
        }
        System.out.println(compareLL(l1.head, l2.head, n));

    }
}