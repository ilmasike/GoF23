package com.kuang.factory.method;
//五菱有个五菱的工厂， 各用各的
public class WulingFactory implements  CarFactory{
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
