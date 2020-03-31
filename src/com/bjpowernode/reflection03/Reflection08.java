package com.bjpowernode.reflection03;

/**
 * ClassName:Reflection08
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/31 12:48
 * @Author:mlc17607163664@163.com
 *
 * 通过一个类获取父类
 */
public class Reflection08 {

    public static void main(String[] args) throws Exception{
        Class<?> superClass = Class.forName("java.lang.String");

        //获取String的父类
        Class<?> sc = superClass.getSuperclass();
        System.out.println(sc.getName());

        //获取String实现类的所有接口
        Class<?>[] interfaces = superClass.getInterfaces();
        for (Class<?> in : interfaces) {
            System.out.println(in.getName());
        }
    }
}
