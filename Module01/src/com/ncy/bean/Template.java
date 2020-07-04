package com.ncy.bean;

import com.ncy.java.HelloWorld;

import java.util.ArrayList;

/**
 * @author ncy
 * @date 2020/7/2 - 19:50
 */
public class Template {
    private static final HelloWorld hl = new HelloWorld();
    public static final int NUM=1;
    public static final int NUMBER=1;

    public static final String NATION="河南";
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("args = " + args);
        System.out.println("Template.main");
        int num=10;
        System.out.println("num = " + num);
        int num1=2;
        System.out.println(num1);
        String[] arr = new String[]{"a","b","c","d"};
        //fori,itar
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");

        for (Object o : list) {
            System.out.println("o = " + o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("list.get(i) = " + list.get(i));
        }
    }

    public void method(){
        ArrayList list = new ArrayList();
        list.add("111");
        list.add("222");
        //ifn
        if (list == null) {
            
        }
        //inn,xxx.nn
        if (list != null) {
            
        }

    }

}
