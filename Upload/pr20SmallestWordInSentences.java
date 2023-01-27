import java.nio.channels.WritableByteChannel;
import java.util.*;

public class pr20SmallestWordInSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        sen += " ";
        String word = "";
        // int mwlen = 0;
        int mwlen = sen.length();
        String mw = "";
        for (int i = 0; i < sen.length(); i++) {
            if (sen.charAt(i) != ' ') {
                word += sen.charAt(i);
            } else {
                int wlen = word.length();
                // System.out.println(word);
                // System.out.println(wlen);
                if (wlen < mwlen) {
                    mwlen = wlen;
                    mw = word;
                }
                word = "";
            }
        }
        System.out.println(mw);
    }
}
