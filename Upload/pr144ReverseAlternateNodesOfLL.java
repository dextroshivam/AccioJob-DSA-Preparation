import java.util.*;

class Solution {
    static LinkedListNode<Integer> rev(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> cur = head;
        while (cur != null) {
            LinkedListNode<Integer> ncur = cur.next;
            cur.next = prev;
            prev = cur;
            cur = ncur;
        }
        return prev;
    }

    static LinkedListNode<Integer> reverseAlternateNodes(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> odd = head;
        LinkedListNode<Integer> even = head.next;
        LinkedListNode<Integer> hEven = head.next;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        hEven = rev(hEven);
        odd.next = hEven;
        return head;
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class pr144ReverseAlternateNodesOfLL {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(sc.nextInt());
        LinkedListNode<Integer> a = head;
        for (int i = 1; i < n; i++) {
            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode<Integer> ans = Solution.reverseAlternateNodes(head);
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(ans.data);
            } else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}

// import java.util.*;

// class Solution {
// static LinkedListNode<Integer> reverseList_(LinkedListNode<Integer> head) {
// LinkedListNode<Integer> prev = null;
// LinkedListNode<Integer> curr = head;

// while (curr != null) {
// // save next pointer
// LinkedListNode<Integer> nextOfCurr = curr.next;

// // reverse pointer
// curr.next = prev;

// // move pointers to the next 2 nodes
// prev = curr;
// curr = nextOfCurr;
// }
// // prev is now at head
// head = prev;

// return head;
// }

// static void displayLL(LinkedListNode<Integer> head) {
// LinkedListNode<Integer> temp = head;
// while (temp.next != null) {
// System.out.print(temp.data + "->");
// temp = temp.next;
// }
// System.out.println(temp.data);
// }

// static LinkedListNode<Integer> reverseAlternateNodes(LinkedListNode<Integer>
// head) {
// LinkedListNode<Integer> odd = head;
// LinkedListNode<Integer> even = head.next;
// LinkedListNode<Integer> HeadOfEven = head.next;

// while (even != null && even.next != null) {
// odd.next = odd.next.next;
// even.next = even.next.next;

// odd = odd.next;
// even = even.next;
// }
// HeadOfEven = reverseList_(HeadOfEven);
// odd.next = HeadOfEven;
// return head;

// // LinkedListNode<Integer> temp = head;
// // LinkedListNode<Integer> temp1 = head.next;
// // LinkedListNode<Integer> d = new LinkedListNode(-1);
// // LinkedListNode<Integer> e = new LinkedListNode(-1);

// // while (temp.next != null && temp.next.next != null) {
// // d.next = temp;
// // temp = temp.next.next;
// // }
// // while (temp1.next != null && temp1.next.next != null) {
// // e.next = temp;
// // temp1 = temp1.next.next;
// // }
// // e = e.next;
// // d = d.next;
// // displayLL(d);
// // displayLL(e);
// // e = reverseList_(e);
// // displayLL(e);
// // LinkedListNode<Integer> cur = d;
// // while (cur.next != null) {
// // cur = cur.next;
// // }
// // cur.next = e;

// // return d;
// }
// }

// class LinkedListNode<T> {
// T data;
// LinkedListNode<T> next;

// public LinkedListNode(T data) {
// this.data = data;
// next = null;
// }
// }

// public class pr144ReverseAlternateNodesOfLL {
// public static void main(String[] args) throws Throwable {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// LinkedListNode<Integer> head = new LinkedListNode<Integer>(sc.nextInt());
// // LinkedListNode<Integer> a = head;
// for (int i = 1; i < n; i++) {
// LinkedListNode<Integer> temp = new LinkedListNode<Integer>(sc.nextInt());
// temp.next = head;
// head = temp;
// temp.next = null;

// }
// LinkedListNode<Integer> ans = Solution.reverseAlternateNodes(head);
// for (int i = 0; i < n; i++) {
// if (i == n - 1) {
// System.out.println(ans.data);
// } else {
// System.out.print(ans.data + " ");
// }
// ans = ans.next;
// }
// }
// }
