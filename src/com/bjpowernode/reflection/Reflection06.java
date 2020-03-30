package com.bjpowernode.reflection;

import java.io.*;
import java.util.Properties;

/**
 * ClassName:reflection06
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 18:07
 * @Author:mlc17607163664@163.com
 */
public class Reflection06 {

    public static void main(String[] args) throws IOException{

        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("login.properties").getPath();
        System.out.println(path);
        FileReader reader = new FileReader(path);*/

        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("login.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();

        String property = pro.getProperty("jdbc.user");
        System.out.println(property);
    }
}
