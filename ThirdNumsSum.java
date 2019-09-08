package test;

import java.util.*;

/*
给定一个无序可重复整数序列，当该序列中任意三个数的和等于0，输出这三个数。
例：序列nums=[-1,0,1,2,-1,-4]，输出[[-1,0,1],[-1,-1,2]]。
class Solution {
public List<List<Integer>> threeSum(int[] nums) {

   }
}

 */
public class ThirdNumsSum {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);
    }

    private static List<List<Integer>> threeSum(int[] nums){
        int len = nums.length;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < len - 1; i++){
            for (int j = i + 1; j < len; j++){
                for (int k = j + 1; k < len; k++){
                    List<Integer> list = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if (!lists.contains(list)){
                            lists.add(list);
                        }
                    }
                }
            }
        }
        return lists;
    }



}
