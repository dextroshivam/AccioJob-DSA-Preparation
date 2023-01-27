
/**
 * pr21CountSquares
 */
import java.util.*;

public class pr21CountSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i * i < n) {
            count += 1;
            i++;
        }
        System.out.println(count);
    }

}