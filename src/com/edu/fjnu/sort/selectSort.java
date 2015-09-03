package com.edu.fjnu.sort;

/**
 * Created by gmy on 15-8-17.
 */
public class selectSort {
    void Sort(int[] array){
        int minIndex = 0;
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++){
            //无序区,最小数据数组下标
            minIndex = i;
            for (int j = i + 1; j < array.length - 1; j++){
                //在无序区找到最小数据并保存其数组下标
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
                //如果无序区最小值位置不是默认的第一个位置,就互相交换
                if (minIndex != i){
                    tmp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int list[] = {1,4,12,18,4,7,3,8,45};

        selectSort selectSort = new selectSort();
        selectSort.Sort(list);

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
