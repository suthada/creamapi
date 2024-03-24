package com.example.myapplication;

public class MainModel {
    String name,sex,age,purl;


    MainModel(){


    }
    public MainModel(String name, String sex, String age, String purl) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return sex;
    }

    public void setDate(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return age;
    }

    public void setType(String age) {
        this.age = age;
    }

    public String getLurl() {
        return purl;
    }

    public void setLurl(String purl) {
        this.purl = purl;
    }
}
