package com.bjpowernode.reflection03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * ClassName:Reflection06
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/31 12:21
 * @Author:mlc17607163664@163.com
 *
 * 通过反射一个类的构造方法
 */
public class Reflection06 {

    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        Class<?> student = Class.forName("com.bjpowernode.service.StudentService");
        sb.append(Modifier.toString(student.getModifiers()));
        sb.append(" class " + student.getSimpleName() + "{\n");

        Constructor<?>[] constructors = student.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            sb.append("\t");
            sb.append(Modifier.toString(constructor.getModifiers()));
            sb.append(" ");
            sb.append(student.getSimpleName());
            sb.append(" (");
            Class<?>[] types = constructor.getParameterTypes();
            for (int i = 0; i < types.length; i++) {
                Class<?> type = types[i];
                if(i == types.length - 1){
                    sb.append(type.getSimpleName());
                }else {
                    sb.append(type.getSimpleName() + ",");
                }
            }
            sb.append("){}\n");
        }

        sb.append("}");
        System.out.println(sb);
    }
}
