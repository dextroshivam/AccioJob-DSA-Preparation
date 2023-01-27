import java.util.*;

public class pr29Biglight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ha = sc.nextInt(), Hb = sc.nextInt(), Va = sc.nextInt(), Vb = sc.nextInt();

        if (Va == Vb) {
            System.out.println("false");
        } else {
            if ((Ha - Hb) % (Vb - Va) == 0) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
