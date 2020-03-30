package com.bjpowernode.reflection03;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * ClassName:Reflection01
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/30 21:49
 * @Author:mlc17607163664@163.com
 *
 * 反编译Field
 */
public class Reflection01 {

    public static void main(String[] args) throws ClassNotFoundException {
        //创建此对象做字符串拼接
        StringBuilder sb = new StringBuilder();
        //通过反射获取Student类
        /*Class<?> student = Class.forName("com.bjpowernode.bean.Student");*/
        Class<?> student = Class.forName("java.lang.Thread");

        sb.append(Modifier.toString(student.getModifiers()) + " class "+ student.getSimpleName() + "{\n");

        //所有的属性
        Field[] fields = student.getDeclaredFields();
        for (Field field : fields) {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));
            sb.append(" ");
            sb.append(field.getType().getSimpleName());
            sb.append(" ");
            sb.append(field.getName());
            sb.append(";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
