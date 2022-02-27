package com.express.ioc.model;

public class Jio implements Sim{

    @Override
    public void calling() {
        System.out.println("calling using jio sim");
    }

    @Override
    public void data() {
        System.out.println("accessing data using jio sim");
    }

    @Override
    public void sms() {
        System.out.println("sending sms using jio sim");
    }

}
