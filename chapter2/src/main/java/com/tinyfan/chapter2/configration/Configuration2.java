package com.tinyfan.chapter2.configration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:properties/config2.properties")
@ConfigurationProperties(prefix = "my")
public class Configuration2 {
    private int age;
    private String name;
    private String qq;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Override
    public String toString() {
        return "MyConfiguration1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", qq='" + qq + '\'' +
                '}';
    }
}
