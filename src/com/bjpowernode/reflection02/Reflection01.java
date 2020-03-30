package com.bjpowernode.reflection02;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ClassName:Reflection01
 * Package:com.bjpowernode.reflection02
 * Description:
 *
 * @Date:2020/3/30 21:05
 * @Author:mlc17607163664@163.com
 */
public class Reflection01 {

    public static void main(String[] args) throws ClassNotFoundException {
        //参数要完整路径带包名
        Class<?> student = Class.forName("com.bjpowernode.bean.Student");
        System.out.println("完整类名：" + student);

        System.out.println("简单类名：" + student.getSimpleName());

        //getFields     获取类中所有的public修饰的Field(属性)
        Field[] fields = student.getFields();
        System.out.println(fields.length);//1
        Field f = fields[0];
        System.out.println(f.getName());//no

        System.out.println("==============");

        //getDeclaredFields     获取类中所有的Field(属性)
        Field[] fs = student.getDeclaredFields();
        for (Field field : fs) {
            //获取属性的修饰符
            int modifiers = field.getModifiers();
            System.out.println("修饰符的代号为：" + modifiers);

            //将修饰符的代号转换为字符串
            String string = Modifier.toString(modifiers);
            System.out.println(string);

            //获取属性的类型
            Class<?> type = field.getType();
            String name = type.getName();
            System.out.println("完整类型" + name);
            System.out.println("简单类型" + type.getSimpleName());

            //获取属性的名字
            System.out.println(field.getName());
        }
    }
}
