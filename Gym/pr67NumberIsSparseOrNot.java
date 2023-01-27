import java.util.*;

public class pr67NumberIsSparseOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        String revbinary = "";
        while (temp != 0) {
            revbinary += String.valueOf(temp % 2);
            temp = temp / 2;
        }
        String binary = "";
        for (int i = revbinary.length() - 1; i >= 0; i--) {
            binary += revbinary.toCharArray()[i];
        }
        boolean flag = false;
        for (int i = 0; i < binary.length() - 1; i++) {
            if (binary.toCharArray()[i] == '1' && binary.toCharArray()[i + 1] == '1') {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
