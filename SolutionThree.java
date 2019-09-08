package test;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionThree {
    public static void main(String[] args) {

        String[] letter = {"ABCDEFGHI", "JKLMNOPQR", "STUVWXYZ "};
        Scanner in = new Scanner(System.in);
        String[] split = in.nextLine().split(" ");
        int month = Integer.valueOf(split[0]);
        int day = Integer.valueOf(split[1]);

        if (month <= 0 || month > 12) {
            return;
        }

        if (day <= 0 || day > 31) {
            return;
        }

        String word = in.nextLine();

        reverse(month - 1, day - 1, letter);

        for (int i = 0; i < word.length(); i++) {
            String alpha = word.substring(i, i + 1);
            for (int j = 0; j < letter.length; j++) {
                int index = letter[j].indexOf(alpha);
                if (index != -1) {
                    System.out.print((j + 1) + "" + (index + 1) + " ");
                    break;
                }
            }
        }
    }

    private static void reverse(int month, int day, String[] letter) {
        reverseMonth(month, letter);
        reverseDay(day, letter);
    }

    private static void reverseDay(int day, String[] letter) {
        int len = letter.length;
        for (int i = 0; i < len; i++) {
            letter[i] = reverseDayByOne(day, letter[i]);
        }
    }

    private static String reverseDayByOne(int day, String s) {
        int times = day % 9;
        int len = s.length();
        StringBuilder[] alphas = new StringBuilder[len];
        for (int i = 0; i < len; i++) {
            alphas[i] = new StringBuilder(s.substring(i, i+1));
        }
        reverseArray(0, times - 1, alphas);
        reverseArray(times, alphas.length - 1, alphas);
        reverseArray(0, alphas.length - 1, alphas);
        StringBuilder alps = new StringBuilder();
        for(StringBuilder sb: alphas){
            alps.append(sb);
        }
        return alps.toString();
    }

    private static void reverseMonth(int month, String[] letter) {
        int times = month % 3;

        reverseArray(0, times - 1, letter);
        reverseArray(times, letter.length - 1, letter);
        reverseArray(0, letter.length - 1, letter);
    }

    private static <T> void reverseArray(int start, int end, T[] letter) {
        int first = start;
        int last = end;
        while (first < last) {
            T temp = letter[first];
            letter[first] = letter[last];
            letter[last] = temp;
            first++;
            last--;
        }
    }
}
