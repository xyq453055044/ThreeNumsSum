package test;

import java.util.ArrayList;

public class sort {

    public static int sort(int total, int[] array){
        int len = array.length;
        int sum = 0;
        if(len == 0){
            return sum;
        }
        for(int i = 0; i < len; i++){
            for (int j = 0; j < len - i -1; j++){
                if (array[j + 1] < array[j]){
                    int temp = array[j +1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int k = 0; k < len; k++){
            sum += array[k];
            if (sum > total){
               sum -= array[k];
               break;
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int total = 188;
        int[] array = {50,42,9,15,105,63,14,30};
        sort(total, array);
    }
}
