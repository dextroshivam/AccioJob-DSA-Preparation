import java.util.*;

public class LastIndexOfOnePr54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.toCharArray()[i] == '1') {
                System.out.println(i);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
