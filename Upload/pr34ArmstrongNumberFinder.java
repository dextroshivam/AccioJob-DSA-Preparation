import java.util.*;

public class pr34ArmstrongNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int size = String.valueOf(n).length();
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int unit = temp % 10;
            temp = temp / 10;
            sum += unit * unit * unit;
        }
        if (sum == n) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
