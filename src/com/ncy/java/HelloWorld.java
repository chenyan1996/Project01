package com.ncy.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {
    public HelloWorld() {
    }

    public static void main(String[] args){
        System.out.println("hello world!");
        System.out.println("hello world!");
        Date date = new Date();
        List<Date> list1=new ArrayList<Date>();
        list1.add(date);
        int num=10;
//        method();
    }

    public static void method(){

        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
