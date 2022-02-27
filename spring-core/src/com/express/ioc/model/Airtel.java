package com.express.ioc.model;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("calling using airtel sim");
    }

    @Override
    public void data() {
        System.out.println("accessing data using airtel sim");
    }

    @Override
    public void sms() {
        System.out.println("sending sms using airtel sim");
    }

}
