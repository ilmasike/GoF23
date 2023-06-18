package com.kuang.factory.abstract1;
//抽象产品工厂
public interface IProductFactory {
    //    1.生产手机：
    IphoneProduct iphoneProduct();
//    2.生成路由器：
    IRouterProduct iRouterProduct();

//    3.现在临时加一个电脑：会导致所有代码都要修改（你得添加电脑接口，电脑接口实现类，等等）
//    故抽象工厂模式，适合稳定的情况。经常加东西的不适合。



}
