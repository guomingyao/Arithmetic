package com.edu.fjnu.sort;

import java.util.Arrays;

/**
 * Created by gmy on 15-8-17.
 *
 * 归并排序
 * 简介:将两个（或两个以上）有序表合并成一个新的有序表 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列
 * 时间复杂度为O(nlogn)
 * 稳定排序方式
 *
 */

public class MergeSort {
    public static int[] Sort(int[]array,int low, int high){
        int mid = (low + high)/2;
        if (low < high){
            //左边排序
            Sort(array, low, mid);
            //右边排序
            Sort(array, mid+1, high);
            //左右归并
            merge(array, low, mid, high);
        }

        return array;

    }

    public static void merge(int[]array,int low, int mid, int high){
        int[] temArray = new int[high - low + 1];
        int i = low;    //左指针
        int j = mid + 1;   //右指针
        int k = 0;      //新数组指针

        //先把左数组和右数组进行比较排序移到新的数组中
        while (i <= mid && j <= high){
            if (array[i] < array[j])
                temArray[k++] = array[i++];
            else
                temArray[k++] = array[j++];
        }

        //把左边剩余的数移入数组
        while (i <= mid){
            temArray[k++] = array[i++];
        }

        //把右边剩余的数移入数组
        while (j <= high){
            temArray[k++] = array[j++];
        }


        for (int k2 = 0; k2 < temArray.length; k2++) {
            array[k2 + low] = temArray[k2];
        }
    }

    public static void main(String[] args) {
        int list[] = {1,4,12,18,4,7,3,8,45};
        MergeSort.Sort(list,0,list.length - 1);
        System.out.println(Arrays.toString(list));
    }
}
