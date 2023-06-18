package com.kuang.factory.method;
//我们需要加一个摩拜，就直接新建摩拜的实现类，和工厂类（调用摩拜实现类）。在去消费者那里调用工厂即可
public class MoBaiFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
