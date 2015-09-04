package com.edu.fjnu.practise.Sept_04_practise;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by gmy on 15-9-4.
 */
public class RedirectOoutputStream {
    public static void main(String[] args) {
        try {
            PrintStream out = System.out;   //保存原输出流
            PrintStream ps = new PrintStream("/home/gmy/下载/myfile.txt");    //重定向创建文件输出流
            System.setOut(ps);
            int age = 18;
            System.out.println("年龄变量定义成功,初始值为18");
            String sex = "女";
            System.out.println("性别变量定义成功,初始值为女");
            String info = "这是一个性别为" + sex + "年龄为" + age +"孩子";
            System.out.println("结果是: " + info);
            System.setOut(out);
            System.out.println("请查看日志");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
