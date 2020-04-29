package com.max.learn.其它.Idea_debug相关;

import org.junit.Test;

import java.util.Arrays;
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
        int [] nums = {0,4,3,0};

//         Scanner input = new Scanner(System.in);
//         System.out.println("请输入一个整数(1-37):");
//         int target = input.nextInt();
        int target = 0;
//         int temp = Arrays.binarySearch(nums, target);
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]);
        System.out.println(ints[1]);


    }

    private static int[] twoSum(int[] nums, int target) {
        int [] ansewr = new int[2];
        for (int i=0; i<nums.length; i++){
            // 判断输入数字与循环元素对比, 大于等于循环元素进入逻辑,否则循环继续
                ansewr[0] = i;
                for (int j = i+1; j<nums.length; j++){
                    if (target-nums[i] == nums[j]){
                        ansewr[1] = j;
                        return ansewr;
                    }
                }
            continue;
        }

        return null;
    }

    @Test
    public void method01(){
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        // Stream anyMatch(Predicate predicate)
        boolean answer = list.stream().anyMatch(n
                -> (n * (n + 1)) / 4 == 5);

        // Displaying the result
        System.out.println(answer);
    }
}
