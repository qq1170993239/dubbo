package com.lix.dubbo.common.entity;

import java.io.Serializable;

/**
 * Created by lixiang on 2019/6/10 0010.
 */
public class UserEntity implements Serializable {

    private static final long serialVersionUID = 4815847623281058679L;

    private int id;

    private  String name;

    private  int age;

    private String sex;

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return (id | 123) << 2 + 36;
    }
}
