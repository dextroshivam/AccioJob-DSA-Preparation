import java.util.*;

public class pr115RecursiveFibbonacci {
    public static int FindNthFibbonaci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }
        int nth = FindNthFibbonaci(n - 1) + FindNthFibbonaci(n - 2);
        return nth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FindNthFibbonaci(n));
    }
}
