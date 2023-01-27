import java.util.*;
// import java.util.concurrent.CountDownLatch;

public class pr41TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int l = 1; l < n; l++) {
                    if ((i + j) % k == 0 && (l + j) % k == 0 && (i + l) % k == 0) {
                        // System.out.println(i + " " + j + " " + l);
                        count += 1;

                    }

                }

            }
        }
        System.out.println(count);

    }
}
