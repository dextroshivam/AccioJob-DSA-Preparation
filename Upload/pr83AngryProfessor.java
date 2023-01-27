import java.util.*;

public class pr83AngryProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int l = 0; l < t; l++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i : arr) {
                if (i <= 0) {
                    count += 1;
                }
            }
            if (count >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
    }
}
