import java.util.*;

public class pr60OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.nextInt() % 2 == 0) {
            count += 1;
        }
        System.out.println(count + 1);
    }
}
