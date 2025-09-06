package com.multithreading.dvd;
public class Thread_Methods_Priority extends Thread{
    public Thread_Methods_Priority( String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Thread is running");

        for(int i = 0; i < 5; i ++){
         String a = "";
            for(int j = 0; j < 1000; j ++)
            {
                a += 'b';
            }
            System.out.println(Thread.currentThread().getName() + " - Priority " + Thread.currentThread().getPriority() + " - count : " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread_Methods_Priority l = new Thread_Methods_Priority("low Priority thread");
        Thread_Methods_Priority m = new Thread_Methods_Priority("mid Priority thread");
        Thread_Methods_Priority h = new Thread_Methods_Priority("high Priority thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        h.start();
    }
}