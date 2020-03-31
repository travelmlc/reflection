package com.bjpowernode.reflection03;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ClassName:Reflection03
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/31 10:58
 * @Author:mlc17607163664@163.com
 */
public class Reflection03 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> service = Class.forName("com.bjpowernode.service.UserService");
        Method[] methods = service.getDeclaredMethods();
        System.out.println(methods.length);

        for (Method method : methods) {
            //获取修饰符列表
            System.out.println(Modifier.toString(method.getModifiers()));

            //获取方法的返回值类型
            Class<?> type = method.getReturnType();
            //System.out.println(type);
            //获取返回值类型的简单名形式
            System.out.println(type.getSimpleName());

            //获取方法名
            System.out.println(method.getName());

            //获取方法的参数列表（一个方法可能会有多个参数）
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                //System.out.println(parameterType);
                //参数类型的简单名
                System.out.println(parameterType.getSimpleName());
            }
        }
    }
}
