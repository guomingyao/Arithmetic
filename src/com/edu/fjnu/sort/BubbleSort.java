package com.edu.fjnu.sort;

import java.awt.*;

/**
 * Created by gmy on 15-8-16.
 */

/*
冒泡排序基本思想:把记录当作一个纵向排列,每趟排序自底向上排列,每次进行相邻比较,如果第上面的数比下面的大,就调换位置,每趟排序都会使排序范围内
最小的数像旗袍一样上浮到对应的位置.
   初态      第1趟   第2趟  第3趟   第4趟   第5趟   第6趟   第7趟
    38        12      12      12      12      12      12      12
    20        38      20      20      20      20      20      20
    46        20      38      25      25      25      25      25
    38        46      25      38      38      38      38      38
    74        38      46      38      38      38      38      38
    91        74      38      46      46      46      46      46
    12        91      74      74      74      74      74      74
    25        25      91      91      91      91      91      91
 */
public class BubbleSort {

    void Sort(int[] array) {
        int i = 0;
        int j = 0;
        int temp = 0;
        int flag = 0;
        int count = 0;
        for (i = 0; i < array.length - 1; i++){      //外循环控制排序的总趟数
            flag = 0;                       //本趟排序开始前，交换标志应为假
            for (j = array.length - 1; j > i; j--){  //内循环控制一趟排序的进行
                if (array[j] < array[j - 1]){       //相邻元素进行比较，若逆序就交换
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = 1;                  //发生了交换，故将交换标志置为真
                }
            }
            if (flag == 0)  //排序未发生交换，提前终止算法
                break;
        }
    }

    public static void main(String[] args) {
        int list[] = {1,4,12,18,4,7,3,8,45};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.Sort(list);

        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + " ");
        }
    }
}
