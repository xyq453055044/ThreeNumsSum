package test;

import java.util.LinkedList;
import java.util.Queue;

public class number {

    public static String[] array(int month){
        int remainder = month % 3;
        String[] array= {"ABCDEFGHI", "JKLMNOPQR", "STUVWXYZ*"};
        if (remainder == 1){
            String temp = array[0];
            array[0] = array[1];
            array[1] = array[2];
            array[2] = temp;
        }
        if (remainder == 2){
            String temp = array[0];
            array[0] = array[2];
            array[2] = array[1];
            array[1] = temp;
        }
        return array;
    }

    public static int number(int day){
        int remainder = day % 9;
        String[] array1 = {"A","B","C","D","E","F","G","H","I"};
        Queue<String> queue = new LinkedList<String>();
        while (remainder == 0){
            for (int i = 0; i < array1.length; i++){
                queue.add(array1[i]);
            }
        }
        for (int i = remainder; i < array1.length; i++){
            queue.add(array1[i-1]);
        }
        for (int i = 0; i < remainder -1; i++){
            queue.add(array1[i]);
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
