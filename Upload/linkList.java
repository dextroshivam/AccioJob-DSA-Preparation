import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        this.data = d;
    }
}

public class linkList {

    static Node head;
    static Node tail;

    public static void addDAta(int val) {
        Node nn = new Node(val);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
    }

    public static void addAtHead(int val) {
        Node nn = new Node(val);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // linkList arr = new linkList();
        for (int i = 0; i < 5; i++) {
            addDAta(sc.nextInt());
        }
        System.out.println(head.data + " " + tail.data);
    }
}
