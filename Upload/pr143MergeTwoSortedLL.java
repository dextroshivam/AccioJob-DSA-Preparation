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

class Solution {
    static Node merge(Node x, Node y) {
        // Node d1 = new Node(-1);
        // Node d2 = new Node(-1);
        Node d = new Node(-1);
        Node cur = d;
        // create pointer
        Node h1 = x;
        Node h2 = y;
        while (h1 != null && h2 != null) {
            // store next nodes
            Node nh1 = h1.next;
            Node nh2 = h2.next;
            if (h1.data < h2.data) {
                cur.next = h1;
                h1 = nh1;
            } else {
                cur.next = h2;
                h2 = nh2;
            }
            cur = cur.next;
        }
        if (h1 == null) {
            cur.next = h2;
        } else {
            cur.next = h1;
        }
        return d.next;
    }
}

public class pr143MergeTwoSortedLL {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1 = new LinkedList();
        for (int i = 0; i < n; i++) {
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for (int i = 0; i < m; i++) {
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}