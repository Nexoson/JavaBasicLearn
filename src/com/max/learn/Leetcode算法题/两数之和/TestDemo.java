package com.max.learn.Leetcode算法题.两数之和;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName Test
 * @Auther huangX
 * @Date 2020/4/28 22:37
 * @Version 1.0
 * @Descripition 两数之和
 **/
public class TestDemo {
    public static void main(String[] args) {
//        int [] nums = {2,8,-1,0,12,0,-15,12,19,31,99,-7};
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] ints = twoSum01(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // 判断输入数字与循环元素对比, 大于等于循环元素进入逻辑,否则循环继续
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
            continue;
        }

        return null;
    }

    private static int[] twoSum01(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.keySet().contains(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i],i);
        }

        return null;
    }

    @Test
    public void method01() {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Stream anyMatch(Predicate predicate)
        boolean answer = list.stream().anyMatch(n
                -> (n * (n + 1)) / 4 == 5);

        // Displaying the result
        System.out.println(answer);
    }
}
