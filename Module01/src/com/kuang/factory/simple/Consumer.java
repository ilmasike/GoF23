package com.kuang.factory.simple;
//测试类：

import static com.kuang.factory.simple.CarFactory.getCar;

public class Consumer {
    public static void main(String[] args) {
////        1.以前要买车的方式：
//        Car car1 = new WuLing();
//        Car car2 = new Tesla();
//
//        car1.name();
//        car2.name();//为了买车，要知道其接口，其实现类等，太麻烦。但是在接口、实现类不知道的情况下呢？

//        我们如果要使用面向对象，最好是直接拿来就用，而不是我们自己还得亲自新建一个对象。
//        比如我想要个五菱宏光，最好直接来店里（工厂）提车，而不是还要亲自管理车的来源。
//        2.工厂模式下：实例化对象不使用new,而是用工厂方法代替：

        Car car1 = getCar("五菱");
        car1.name();
        Car car2 = getCar("特斯拉");
        car2.name();
//        Car 五菱2  = new WuLing();//这种写法，限制了必须知道实现类。而工厂直接调用就行了(无需关心细节，接口，实现了，参数等，比如getCar("五菱")里面的参数等)。


    }


}
