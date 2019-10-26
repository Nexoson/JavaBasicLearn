package com.max.learn.排序;


/**
 * @ClassName SortMethod
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/9 22:23
 * @Version 1.0
 **/
public class SortMethod {

    public static void main(String[] args) {

        int[] testArray = getTestArray();
        int[] arr = {};
        //arr = bubbleSort(testArray);
        arr = selectionSort(testArray);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    // 获取初始测试数据
    static int [] getTestArray(){
        int [] array = {9,-2,10,35,6,7,1,24,-16,22,17};
        return array;
    }

    /**
     * @Author huangX
     * @Description 冒泡排序
     * @Date 22:26 2019/9/9
     * @Param array
     * @return
     **/
    static int [] bubbleSort(int [] array){
        int temp = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }


    /**
     * @Author huangX
     * @Description 选择排序
     * @Date 22:30 2019/9/9
     * @Param
     * @return
     **/
    static int [] selectionSort(int [] array){
        int temp;
        int index = 0;
        boolean flag = false;
        for (int i = 0; i <array.length ; i++) {
            temp = array[i];
            for (int j = i+1; j < array.length; j++) {
                if (temp > array[j]){
                    temp = array[j];
                    index = j;
                    flag = true;
                }
            }
            if(flag){
                array[index] = array[i];
                array[i] = temp;
                flag = false;
            }
        }
        return array;
    }


    /**
     * @Author huangX
     * @Description 插入排序
     * @Date 22:31 2019/9/9
     * @Param
     * @return
     **/
    static int [] insertionSort(int [] array){

        int temp ;
        for (int i = 0; i < array.length-1; i++) {

            for (int j = i+1; j > 0; j--) {
                if(array[j] > array[j-1]){
                   temp = array[j];
                   array[j] = array[j-1];
                   array[j-1] = temp;
               }
            }
        }


        return array;
    }



    /**
     * @Author huangX
     * @Description 归并排序
     * @Date 22:31 2019/9/9
     * @Param
     * @return
     **/
    static int [] mergeSort(int [] array){

        return null;
    }


    /**
     * @Author huangX
     * @Description 快速排序
     * @Date 22:34 2019/9/9
     * @Param
     * @return
     **/
    static int [] quickSort(int [] array){
    // code is my life !
    // I have no choice

        return null;
    }
}
