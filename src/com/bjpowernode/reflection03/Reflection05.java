package com.bjpowernode.reflection03;

import com.bjpowernode.service.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName:Reflection05
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/31 12:01
 * @Author:mlc17607163664@163.com
 *
 * 重点：必须掌握，通过反射机制怎么调用一个对象的方法
 *
 * 调用方法的要素：
 *      1、对象
 *      2、有方法
 *      3、实参列表
 *      4、返回值
 *
 * 反射机制让代码具有通用性，可变化的内容都是写入配置文件当中，将来修改配置文件，创建的对象不一样，调用的方法也不同
 * 但是java代码却不用修改
 */
public class Reflection05 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        //不使用反射机制，怎么调用方法
        UserService service = new UserService();
        boolean login = service.login("admin", "123");
        System.out.println(login ? "登录成功" : "登陆失败");
        service.logout();

        //通过反射机制调用方法
        //通过反射机制获取类
        Class<?> user = Class.forName("com.bjpowernode.service.UserService");
        //通过类获取对象
        Object instance = user.newInstance();

        //user.getDeclaredMethod("login");
        Method log = user.getDeclaredMethod("login", String.class, String.class);

        //反射机制中最最最最重要的方法
        Object admin = log.invoke(instance, "admin", "123");
        System.out.println((boolean)admin ? "通过反射机制登录成功" : "通过反射机制登陆失败");
    }
}
