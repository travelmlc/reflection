package com.bjpowernode.reflection;

import java.util.ResourceBundle;

/**
 * ClassName:Reflection07
 * Package:com.bjpowernode.reflection
 * Description:
 *
 * @Date:2020/3/30 18:57
 * @Author:mlc17607163664@163.com
 *
 * java.util包下提供了一个资源绑定器ResourceBundle(静态类)，便于获取属性配置文件中的内容
 * 使用这种方式，配置文件xxx.properties必须放到类路径下。
 */
public class Reflection07 {

    public static void main(String[] args) {
        //资源绑定器，只能绑定xxx.properties文件，并且这个文件必须在类路径下，文件扩展名也必须是properties
        //并且在写路径时，路径后面的扩展名不能写
        //ResourceBundle bundle = ResourceBundle.getBundle("login");
        ResourceBundle bundle = ResourceBundle.getBundle("com/bjpowernode/bean/db");

        String string = bundle.getString("jdbc.user");
        System.out.println(string);
    }
}
