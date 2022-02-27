package com.express.ioc.model;

public class Vodafone implements Sim{

    @Override
    public void calling() {
        System.out.println("calling using vodafone sim");
    }

    @Override
    public void data() {
        System.out.println("accessing data using vodafone sim");
    }

    @Override
    public void sms() {
        System.out.println("sending sms using vodafone sim");
    }
}
