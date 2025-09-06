package com.multithreading.dvd;
public class Thread_Methods_interrupt extends Thread {
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("Thread is running");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread_Methods_interrupt t1 = new Thread_Methods_interrupt();
        t1.start();
        t1.interrupt();
        // this will throw an exception as when 't1' is called, it performs its 'run', there is a sleep of 1000 ms, then the complier send it to 'blocked' state 
        // and gives chance to the 'main' thread 
    }
}