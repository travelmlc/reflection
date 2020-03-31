package com.bjpowernode.reflection03;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ClassName:Reflection04
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/31 11:13
 * @Author:mlc17607163664@163.com
 *
 * 反编译(了解)
 */
public class Reflection04 {

    public static void main(String[] args) throws ClassNotFoundException {
        StringBuilder sb = new StringBuilder();
        //Class<?> user = Class.forName("com.bjpowernode.service.UserService");
        Class<?> user = Class.forName("java.lang.String");

        sb.append(Modifier.toString(user.getModifiers()) + " class " + user.getSimpleName() + " {\n");
        Method[] methods = user.getDeclaredMethods();
        for (Method method : methods) {
            sb.append("\t");
            sb.append(Modifier.toString(method.getModifiers()));
            sb.append(" ");
            sb.append(method.getReturnType().getSimpleName());
            sb.append(" ");
            sb.append(method.getName());
            sb.append(" (");

            //参数列表
            Class<?>[] parameterTypes = method.getParameterTypes();
            /*for (int i = 0; i < parameterTypes.length; i++) {
                Class<?> type = parameterTypes[i];
                if(i == parameterTypes.length-1){
                    sb.append(type.getSimpleName());
                }else {
                    sb.append(type.getSimpleName() + ",");
                }
            }*/
            for (Class<?> type : parameterTypes) {
                sb.append(type.getSimpleName());
            }

            //有参数就删除最后一个位置
            if(parameterTypes.length > 0){
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
