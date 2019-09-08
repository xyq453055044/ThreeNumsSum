package test;


import java.util.Scanner;

public class SolutionTwo {
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
        char[] alphas = s.toCharArray();

        for (int i = 0; i < times; i++) {
            int j = 0;
            char c = alphas[0];
            while (j < alphas.length - 1) {
                alphas[j] = alphas[j + 1];
                j++;
            }
            alphas[j] = c;
        }
        return new String(alphas);
    }

    private static void reverseMonth(int month, String[] letter) {
        int times = month % 3;

        for (int i = 0; i < times; i++) {
            int j = 0;
            String str = letter[0];
            while (j < letter.length - 1) {
                letter[j] = letter[j + 1];
                j++;
            }
            letter[j] = str;
        }
    }
}
