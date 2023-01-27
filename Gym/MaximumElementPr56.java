import java.util.*;

public class MaximumElementPr56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();
            if (query == 1) {
                int ele = sc.nextInt();
                stack.push(ele);
            } else if (query == 2) {
                stack.pop();
            } else {
                Iterator value = stack.iterator();
                int max = stack.get(0);
                while (value.hasNext()) {
                    int ele = (int) value.next();
                    if (ele > max) {
                        max = ele;
                    }
                }
                System.out.println(max);
            }
        }

    }
}

// 10
// 1 97
// 2
// 1 20
// 2
// 1 26
// 1 20
// 2
// 3
// 1 91
// 3
