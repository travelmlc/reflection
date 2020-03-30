package com.bjpowernode.reflection03;

/**
 * ClassName:ArgsTest
 * Package:com.bjpowernode.reflection03
 * Description:
 *
 * @Date:2020/3/30 22:27
 * @Author:mlc17607163664@163.com
 *
 * 可变长参数
 *      语法：类型...(一定是3个点)
 *
 *      1、可变长参数要求的参数个数是：0 ~ N个
 *      2、可变长参数在参数列表中必须是最后一个位置上，而且只能有一个
 *      3、可变长参数可以当数组
 */
public class ArgsTest {

    public static void main(String[] args) {
        method();
        method(10);
        method(10,20);
        method(10,20,30,40);
        method02("abc",10);
        method02("abc",10,20);
        method02("abc",10,20,30,40);
        method03("aa","bb","cc","dd","ee");

        String[] arg = {"aa","bb","cc","dd","ee"};
        method03(arg);
    }

    public static void method(int... i){
        System.out.println("method的形参列表类型是可变长参数");
    }

    /*public static void method01(String... args, int... i){
        System.out.println("method的形参列表类型是可变长参数");
    }*/

    public static void method02(String args,int... i){
        System.out.println("method的形参列表类型是可变长参数");
    }

    //可变长参数可以当做数组,也可以传递一个数组
    public static void method03(String... args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
