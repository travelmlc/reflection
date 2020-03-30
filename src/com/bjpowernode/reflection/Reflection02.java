package com.bjpowernode.reflection;

/**
 * ClassName:Reflection02
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 16:58
 * @Author:mlc17607163664@163.com
 */
public class Reflection02 {

    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName("com.bjpowernode.bean.User");
            //newInstance()这个方法会调用User的无参数构造方法，完成对象的创建
            //newInstance()调用的是无参数构造方法，必须保证无参构造方法存在
            Object user = c.newInstance();

            System.out.println(user);//com.bjpowernode.bean.User@4554617c
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
