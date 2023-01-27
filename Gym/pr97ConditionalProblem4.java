import java.util.*;

public class pr97ConditionalProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        switch (a.toCharArray()[0]) {
            case 'A':
                System.out.println("I am the first letter");
                break;
            case 'B':
                System.out.println("I am the second letter");
                break;
            case 'C':
                System.out.println("I am the third letter");
                break;
            case 'D':
                System.out.println("I am the fourth letter");
                break;
            case 'E':
                System.out.println("I am the fifth letter");
                break;

            default:
                System.out.println("I don't belong here");
                break;
        }
    }
}
