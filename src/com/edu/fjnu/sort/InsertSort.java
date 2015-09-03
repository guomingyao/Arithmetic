package com.edu.fjnu.sort;

/**
 * Created by gmy on 15-8-17.
 */
public class InsertSort {
    void sort(int[] array){
        for(int i = 1; i < array.length; i++){
           //被标记要进行比较的数据
            int currentValue = array[i];
            int j;
            //如果被标记要进行比较的数据前面的数据比标记数据大,则把大于标记数据的数据都往后移动一位
            for ( j = i -1; j > 0; j--){
                if (currentValue < array[j]) {
                    array[j + 1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = currentValue;
        }
    }

    public static void main(String[] args) {
        int list[] = {1,4,12,18,4,7,3,8,45};
        InsertSort insertSort = new InsertSort();
        insertSort.sort(list);

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
