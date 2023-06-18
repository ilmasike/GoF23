package com.kuang.factory.abstract1;
//华为路由器：

public class HuaWeiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");

    }

    @Override
    public void openwifi() {
        System.out.println("打开华为WiFi");

    }

    @Override
    public void setting() {
        System.out.println("打开华为路由器设置");
    }
}
