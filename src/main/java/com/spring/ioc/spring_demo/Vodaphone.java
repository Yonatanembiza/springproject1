package com.spring.ioc.spring_demo;

public class Vodaphone implements Sim {

    public Vodaphone() {
        // TODO Auto-generated constructor stub
        System.out.println("Vodaphone object created!");
    }

    @Override
    public void calling() {
        // TODO Auto-generated method stub
        System.out.println("calling using vodaphone sim");
    }

    @Override
    public void data() {
        // TODO Auto-generated method stub
        System.out.println("browsing the internet using vodaphone sim");
    }

}