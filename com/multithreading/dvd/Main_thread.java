package com.multithreading.dvd;
public class Main_thread{
    public static void main(String[] args) {
        World w = new World();
        w.start();
        for(; ;)
        {
           // System.out.println("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}