package com.kuang.factory.abstract1;
//小米路由器：

public class XiaomiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");

    }

    @Override
    public void openwifi() {
        System.out.println("打开小米WiFi");

    }

    @Override
    public void setting() {
        System.out.println("打开小米路由器设置");
    }
}
