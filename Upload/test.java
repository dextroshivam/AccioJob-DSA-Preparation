import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        sc.close();
        System.out.println(celsiusToFahrenheit(C));
    }

    public static double celsiusToFahrenheit(int C) {
        // your code here
        double d = C * 1.8;
        d += 32;
        return d;
    }
}