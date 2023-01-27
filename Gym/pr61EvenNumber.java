import java.util.*;

public class pr61EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();
            for (int i = n; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
