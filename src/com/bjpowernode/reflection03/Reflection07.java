package com.bjpowernode.reflection03;

import com.bjpowernode.service.StudentService;

import java.lang.reflect.Constructor;

/**
 * ClassName:Reflection07
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/31 12:38
 * @Author:mlc17607163664@163.com
 *
 */
public class Reflection07 {

    public static void main(String[] args) throws Exception{
        //不使用反射机制创建对象
        StudentService service1 = new StudentService();
        StudentService service2 = new StudentService(1,"zs","2011",true);

        //通过反射机制创建对象
        Class<?> stu = Class.forName("com.bjpowernode.service.StudentService");
        //调用无参数的构造方法
        Object o = stu.newInstance();
        System.out.println(o);

        //调用有参数的构造方法
        //1、获取到含有参数构造方法
        Constructor<?> c = stu.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
        //2、调用构造方法new对象(含有参数的构造方法)
        Object o1 = c.newInstance(10, "zs", "2222", true);
        System.out.println(o1);

        //获取无参的构造方法
        Constructor<?> c1 = stu.getDeclaredConstructor();
        Object o2 = c1.newInstance();
        System.out.println(o2);
    }
}
