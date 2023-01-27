import java.util.*;

import javax.print.event.PrintEvent;

public class pr11Staircase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int b = 0; b < (n - i); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= i; c++) {
                System.out.print("#");

            }
            System.out.println();
        }
    }

}
