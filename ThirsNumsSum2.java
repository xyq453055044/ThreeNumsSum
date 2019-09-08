package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirsNumsSum2 {

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(arr);
        System.out.println(lists);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int len = nums.length;
        if (len > 2){
            for (int i = 0; i < len; i++) {
                List<Integer> list = new ArrayList<>();
                int target = nums[i];
                boolean isSuccess = twoSum(nums, target, list);
                if (isSuccess) {
                    list.add(target);
                    Collections.sort(list);
                    if (!lists.contains(list)) {
                        lists.add(list);
                    }
                }

            }

        }
        return lists;
    }

    private static boolean twoSum(int[] nums, int target, List<Integer> list) {
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++){
                int sum = nums[i] + nums[j];
                if (sum + target == 0) {
                    list.add(nums[i]);
                    list.add(nums[j]);
                    return true;
                }
            }

        }
        return false;
    }
}
