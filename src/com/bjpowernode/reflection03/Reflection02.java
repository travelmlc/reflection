package com.bjpowernode.reflection03;

import com.bjpowernode.bean.Student;

import java.lang.reflect.Field;

/**
 * ClassName:Reflection02
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/30 22:10
 * @Author:mlc17607163664@163.com
 *
 * 重点：通过反射机制访问属性对象
 */
public class Reflection02 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchFieldException {
        //不使用反射机制获取一个属性的值
        Student stu = new Student();
        stu.no = 100;
        System.out.println(stu.no);

        //使用反射机制获取一个属性的值
        Class<?> student = Class.forName("com.bjpowernode.bean.Student");
        //obj就是student对象，底层调用无参数的构造方法
        Object obj = student.newInstance();

        //获取no属性
        Field no = student.getDeclaredField("no");
        //给no属性赋值
        no.set(obj,200);
        System.out.println(no.get(obj));

        //访问私有的name属性
        Field name = student.getDeclaredField("name");

        //打破封装(加上了下面这行代码，就可以打破封装)
        //反射机制的缺点：打破封装，可能会给不法分子留下机会
        name.setAccessible(true);

        name.set(obj,"ergz");
        System.out.println(name.get(obj));
    }
}
