// import java.util.*;

// public class pr90TimeConversion {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String time = sc.next();
// int len = time.length();

// int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
// if (time.charAt(len - 2) == 'A') {
// if (hour == 12) {
// System.out.println("00" + time.substring(2, len - 2));
// } else {
// System.out.println(time.substring(0, len - 2));
// }
// } else {
// if (hour != 12) {
// hour += 12;
// System.out.println(hour + time.substring(2, len - 2));
// } else {
// System.out.println(time.substring(0, len - 2));
// }

// }

// }
// }
// 07:05:45PM
// 12:01:00PM

// // my early approach
// import java.util.*;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String str = sc.next();
// // System.out.println(str);
// char charArr[] = str.toCharArray();
// if (str.equals("12:00:00AM")) {
// // System.out.println("done1");
// System.out.println("00:00:00");
// return;
// } else if ((str == "12:00:00PM")) {
// System.out.println("12:00:00");
// return;
// } else {
// // System.out.println("done2");

// int hour = Integer.parseInt(str.substring(0, 2));
// if (charArr[charArr.length - 2] == 'P') { // pm
// if (hour != 12) {
// hour = 12 + hour;
// System.out.println(String.valueOf(hour) + str.substring(2, str.length() -
// 2));

// } else {
// System.out.println(str.substring(0, str.length() - 2));
// }
// } else { // am
// System.out.println(str.substring(0, str.length() - 2));
// }

// }

// }
// }
// 07:05:45PM
// 12:01:00PM