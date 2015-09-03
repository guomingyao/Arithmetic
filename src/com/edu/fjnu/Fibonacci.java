package com.edu.fjnu;

/**
 * Created by gmy on 15-8-30.
 */
public class Fibonacci {

    //数组实现
    public static void FbiArray(int n){
        int i;
        int []a = new int[n];
        a[0] = 0;
        a[1] = 1;
        for (i = 2; i < n; i++){
            a[i] = a[i - 1] + a[i - 2];
            System.out.println(a[i]);
        }
    }

    //递归实现
    public static int Fbi(int n){
        if (n < 2)
            return n == 0? 0 : 1;
        return Fbi(n - 1) + Fbi(n - 2);
    }

    //递推实现
    public static int FbiNormal(int n){
        int n1= 1, n2 = 1, ns = 0;
        for (int i = 1; i < n; i++){
            ns = n1 + n2;
            n1 = n2;
            n2 = ns;
        }
        return ns;
    }

}
