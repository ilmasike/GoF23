package com.kuang.factory.method;
//特斯拉有个特斯拉的工厂， 各用各的
public class TeslaFactory implements  CarFactory{
    @Override
    public Car getCar() {
        return new Tesla();
    }
}
