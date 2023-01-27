public class sumOfNNaturalRecursive {
    public static int son(int n) {
        if (n == 0)
            return 0;
        int sum = son(n - 1) + n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(son(10));
    }
}