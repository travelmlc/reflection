package com.bjpowernode.reflection;

import java.util.Date;

/**
 * ClassName:Reflection01
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 13:21
 * @Author:mlc17607163664@163.com
 *
 * 反射
 */
public class Reflection01 {

    public static void main(String[] args) {
        Class c1 = null;
        /*
            Class.forClass();
                1、是一个静态方法
                2、方法的参数是一个字符串
                3、字符串需要的是一个完整类名
                4、完整类名必须带有包名，java.lang不能省略
         */
        try {
            c1 = Class.forName("java.lang.String");
            Class<?> c2 = Class.forName("java.util.Date");
            Class<?> c3 = Class.forName("java.lang.System");
            Class<?> c4 = Class.forName("java.util.List");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //java中任何一个对象都有一个方法：getClass();
        String s = "abc";
        Class x = s.getClass();
        System.out.println(c1 == x);
        
        //任何类型都有class属性
        Class<String> stringClass = String.class;
        Class<Date> dateClass = Date.class;
    }
}
