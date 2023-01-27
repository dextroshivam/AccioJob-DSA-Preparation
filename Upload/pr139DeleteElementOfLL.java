
/**
 * createLL
 */

import java.util.*;

class Node {
    int data;
    Node next;

    public Node() {

    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class pr139DeleteElementOfLL {
    static Node head;
    static Node tail;

    public static void addTail(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public static void addHead(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
    }

    public static void delMid(int mid) {
        if (mid == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < mid - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        // temp.next.next = null;
    }

    public static void displayLL() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
        // 2
        // 4
        // 1 2 3 4
        // 5
        // 1 3 5 2 6
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt(); // input size of linked list
        for (int i = 0; i < size; i++) {
            addTail(sc.nextInt()); // add values at the tail of LL
        }
        int idx = sc.nextInt();
        delMid(idx); // delete middle element
        displayLL(); // displaing the LL
    }

}
