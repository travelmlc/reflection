package com.bjpowernode.service;

/**
 * ClassName:StudentService
 * Package:com.bjpowernode.service
 * Description:
 *
 * @Date:2020/3/31 12:22
 * @Author:mlc17607163664@163.com
 */
public class StudentService {

    int no;
    String name;
    String birth;
    boolean sex;

    public StudentService() {
    }

    public StudentService(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public StudentService(int no) {
        this.no = no;
    }

    public StudentService(int no, String name, String birth) {
        this.no = no;
        this.name = name;
        this.birth = birth;
    }

    public StudentService(int no, String name, String birth, boolean sex) {
        this.no = no;
        this.name = name;
        this.birth = birth;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "StudentService{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", sex=" + sex +
                '}';
    }
}
