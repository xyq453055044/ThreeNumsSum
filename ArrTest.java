package test;

import java.util.Arrays;

public class ArrTest {

    public static void main(String[] args) {
        int[] arr = {12,2,3,22,89,25,34};
        int a =  Arrays.binarySearch(arr,25);
        System.out.println(a);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
