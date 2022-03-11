package com.cc.java;

public class Child extends Parent{
    

    public String sayHello() {
        System.out.println(super.sayHello());
        return "Hello from Child!";
    }

}
