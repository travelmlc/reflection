package com.bjpowernode.reflection;

/**
 * ClassName:Reflection04
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 17:21
 * @Author:mlc17607163664@163.com
 * Class.forName()发生了什么？
 *      如果只希望一个类的静态代码块执行，其他方法不执行，可以使用
 *          Class.forName("完整类名");
 *      这个方法的执行会导致类加载，类加载时，静态代码块执行
 */
public class Reflection04 {

    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName()的执行会导致类加载，而静态代码在类加载时执行，并且只执行一次
        Class.forName("com.bjpowernode.reflection.MyClass");
    }
}

class MyClass{

    static {
        System.out.println("MyClass的静态代码块执行");
    }
}
