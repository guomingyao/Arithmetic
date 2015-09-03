package com.edu.fjnu;

/**
 * Created by gmy on 15-8-31.
 */
public class KMP {
    void get_next(String []T, int []next){
        int i,j;
        j = 0;
        i = 1;
        next[1] = 0;
        while (i < T.length-1){
            if (j == 0 || T[i] == T[j]){    //T[i]表示后缀的单个字符
                ++i;                       //T[j]表示前缀的单个字符
                ++j;
                next[i] = j;
            }else
                j = next[j];
        }
    }

    int index_KMP(String s, String T, int pos){
        int i = pos;
        int j = i;
        return 1;
    }
}
