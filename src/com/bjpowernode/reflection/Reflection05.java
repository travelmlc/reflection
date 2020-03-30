package com.bjpowernode.reflection;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ClassName:Reflection05
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 17:30
 * @Author:mlc17607163664@163.com
 *
 * 路径问题
 */
public class Reflection05 {

    public static void main(String[] args) throws Exception {

        /*
            这种路径的缺点：只能在idea中使用，因为idea默认的当前路径是project的根
            换个开发环境后，当前路径可能不是project的根
         */
        //FileReader reader = new FileReader("reflection/jdbc.properties");

        /*
            以下方式的路径，必须在类路径下，也就是src文件夹下面
            什么是类路径？在src下面的路径，是类的根路径
         */
        //若出现空指针异常，重启idea
        String path = Thread.currentThread().getContextClassLoader()
                .getResource("login.properties").getPath();
        System.out.println(path);

        //获取db.properties文件的绝对路径(从类的根路径下为起点，也就是src以下开始)
        String path2 = Thread.currentThread().getContextClassLoader()
                .getResource("com/bjpowernode/bean/db.properties").getPath();
        System.out.println(path2);
    }
}
