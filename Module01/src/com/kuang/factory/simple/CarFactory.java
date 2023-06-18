package com.kuang.factory.simple;
//简单工厂模式（静态工厂模式）：有弊端，后期要修改工厂代码（开闭原则）。不过我们用的最多的还就是简单工厂模式
//因为如果为了满足开闭原则（工厂方法模式）， 我们要付出狠多的成本。
//车工厂
public class CarFactory {
    public  static Car getCar(String car){
        if(car.equals("五菱")){
            return  new WuLing();
        }else if(car.equals("特斯拉")){
            return  new Tesla();
        }else{
            return null;
        }

    }
//    简单工厂模式（静态工厂模式）弊端：如果再有个大众车，是不是还要在这里类里加一个：else if(car.equals("大众"))?
//    这很麻烦：违反开闭原则（对修改关闭）。我们最好是完全不用改变工厂里的类


}
