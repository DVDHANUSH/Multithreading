package com.multithreading.dvd;

public class Threads_implements_and_extends_ThreadClass {
    
     public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        MyThread t = new MyThread(r); // passing runnable to Thread constructor
        t.start();
    }
}

class MyThread extends Thread {
    public MyThread(MyRunnable r) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public void run() {
        System.out.println("Inside MyThread.run()");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside MyRunnable.run()");
    }
}