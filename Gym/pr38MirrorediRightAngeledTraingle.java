import java.util.*;

public class pr38MirrorediRightAngeledTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        int t = 1;
        for (int k = 0; k < t; k++) {
            int n = 5;
            // int n = sc.nextInt();
            for (int i = n; i > 0; i--) {
                for (int j = i - 1; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = n - i + 1; j > 0; j--) {
                    System.out.print(i);
                }
                System.out.println();

            }
        }
    }
}

// 5
// 44
// 333
// 2222
// 11111