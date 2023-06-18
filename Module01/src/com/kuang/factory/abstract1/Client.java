package com.kuang.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("===================小米厂子产品：====================");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
//        1.生成手机
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.sendSMS();//试试新手机的功能是否良好

//        2、生成路由：
        IRouterProduct iRouterProduct = xiaomiFactory.iRouterProduct();
        iRouterProduct.openwifi();





        System.out.println("===================华为厂子产品：====================");
        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
//        1.生成手机
        IphoneProduct iphoneProduct2 = huaWeiFactory.iphoneProduct();
        iphoneProduct2.sendSMS();//试试新手机的功能是否良好

//        2、生成路由：
        IRouterProduct iRouterProduct2 = huaWeiFactory.iRouterProduct();
        iRouterProduct2.openwifi();


    }
}
