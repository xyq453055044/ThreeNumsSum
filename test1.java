package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test1 {

    public static void re(String str){
        StringBuffer buffer = new StringBuffer(str);
        System.out.println(buffer.reverse());
        System.out.println(str);
    }
    public static void main(String[] args) {
        int[] arr = {23,14,2,8,94,56,49,81};
        // re("abcda");
        test1(9);
        test2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int test1(int num){
        int a = num / 2;
        System.out.println(a);
        return a;
    }

    private static int[] test2(int[] arr){
        int[] a = Arrays.copyOfRange(arr,0,4);
        System.out.println(Arrays.toString(a));
        return a;
    }
}