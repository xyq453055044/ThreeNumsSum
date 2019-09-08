package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolutionOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalMoney = Integer.valueOf(in.nextLine());
        String priceStr = in.nextLine();
        String[] splitStr = priceStr.split(" ");
        List<Integer> priceList = strArray2List(splitStr);
        int sumPrice = 0;
        int len = priceList.size();
        int i = 0;
        for (; i < len; i++) {
            sumPrice += priceList.get(i);
            if (sumPrice > totalMoney) {
                break;
            }
        }
        if(i>=len){
            System.out.println(sumPrice);
            return;
        }
        sumPrice -= priceList.get(i);
        System.out.println(sumPrice);

    }

    private static List<Integer> strArray2List(String[] splitStr) {

        List<Integer> list = new ArrayList<>();
        for (String str : splitStr) {
            Integer price = Integer.valueOf(str);
            list.add(price);
        }
        Collections.sort(list);
        return list;
    }
}
