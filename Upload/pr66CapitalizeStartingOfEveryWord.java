import java.util.*;

public class pr66CapitalizeStartingOfEveryWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String res = "";
        for (String i : arr) {
            // System.out.println(i);
            String firstLetter = String.valueOf(i.toCharArray()[0]).toUpperCase();
            String finalWord = firstLetter + i.substring(1);
            res += finalWord + " ";
        }
        System.out.println(res);
        // for(String i:arr){
        // if(i.toCharArray()[0])
        // }
    }
}
