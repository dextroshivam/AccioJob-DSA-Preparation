import java.util.*;

public class pr99CountOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        HashSet<Integer> setarr = new HashSet<>();
        for (int i : arr) {
            setarr.add(i);
        }
        ArrayList<Integer> count = new ArrayList<>();
        for (int i : setarr) {
            // int ele = i;
            int occurence = 0;
            for (int j : arr) {
                if (j == i) {
                    occurence += 1;
                }
            }
            count.add(occurence);
        }
        for (Integer i : count) {
            System.out.print(i + " ");

        }
    }
}
