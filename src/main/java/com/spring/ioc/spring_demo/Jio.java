package com.spring.ioc.spring_demo;

public class Jio implements Sim {

    public Jio() {
        // TODO Auto-generated constructor stub
        System.out.println("Jio object created!");
    }

    @Override
    public void calling() {
        // TODO Auto-generated method stub
        System.out.println("calling using Jio sim");
    }

    @Override
    public void data() {
        // TODO Auto-generated method stub
        System.out.println("browsing the internet using Jio sim");
    }

}