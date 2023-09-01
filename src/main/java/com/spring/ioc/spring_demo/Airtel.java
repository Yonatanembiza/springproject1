package com.spring.ioc.spring_demo;

public class Airtel implements Sim {

    public Airtel() {
        // TODO Auto-generated constructor stub
        System.out.println("Airtel object created!");
    }

    @Override
    public void calling() {
        // TODO Auto-generated method stub
        System.out.println("calling using airtel sim");
    }

    @Override
    public void data() {
        // TODO Auto-generated method stub
        System.out.println("browsing the internet using airtel sim");
    }

}