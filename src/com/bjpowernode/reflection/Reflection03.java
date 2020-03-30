package com.bjpowernode.reflection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName:Reflection03
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 17:06
 * @Author:mlc17607163664@163.com
 *
 * 验证反射机制的灵活性
 *      java代码写一遍，在不改变源代码的基础上，可以做到不同对象的实例化，符合OCP开闭原则(对扩展开放，对修改关闭)
 * SSM框架中的底层实现原理都是反射机制，写配置文件，例如：applicationContext、springMVC、mybatis、mapper等等
 */
public class Reflection03 {

    public static void main(String[] args) {

        try {
            //通过字符输入流读取配置文件
            FileReader reader = new FileReader("reflection/src/login.properties");
            //创建类属性对象Map
            Properties properties = new Properties();
            //加载
            properties.load(reader);

            //关闭流
            reader.close();
            String user = properties.getProperty("jdbc.user");
            System.out.println(user);

            //通过反射实力化对象
            Class<?> name = Class.forName(user);
            Object obj = name.newInstance();
            System.out.println(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
