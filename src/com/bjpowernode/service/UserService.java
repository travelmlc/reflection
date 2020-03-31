package com.bjpowernode.service;

/**
 * ClassName:UserService
 * Package:com.bjpowernode.service
 * Description:
 *
 * @Date:2020/3/31 10:56
 * @Author:mlc17607163664@163.com
 *
 * 业务类
 */
public class UserService {

    /**
     * 登录系统
     * @param name      用户名
     * @param password  密码
     * @return          true表示登录成功，false表示登陆失败
     */
    public boolean login(String name,String password){

        if("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }

    public boolean login(){
        return true;
    }

    /**
     * 退出系统
     */
    public void logout(){
        System.out.println("退出系统！");
    }
}
