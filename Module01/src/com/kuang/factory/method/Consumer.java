package com.kuang.factory.method;
//测试类：

import com.sun.org.apache.bcel.internal.generic.NEW;

import static com.kuang.factory.simple.CarFactory.getCar;

public class Consumer {

    public static void main(String[] args) {
        Car car1 = new WulingFactory().getCar();//通过调用五菱工厂，来拿到车
        Car car2 = new TeslaFactory().getCar();
        car1.name();
        car2.name();

//新增一个摩拜：完全不用改动别的代码（满足开闭原则）：
        Car car3 = new MoBaiFactory().getCar();
        car3.name();
//        Car car2 = new WuLing();
    }
//结构复杂度：简单工厂模式完胜
//    代码复杂度：简单工厂模式完胜
//    客户端编程复杂度：简单工厂模式完胜
//    管理复杂度：简单工厂模式完胜

//    根据设计原则：要使用工厂方法模式，
//    但是实际业务往往使用：简单工厂模式。





}
