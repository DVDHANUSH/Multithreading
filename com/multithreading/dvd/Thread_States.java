package com.multithreading.dvd;
public class Thread_States extends Thread { 
    @Override
    public void run(){
        System.out.println("RUNNING");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
           System.out.println(e);
        }
    }  
    public static void main(String[] args) throws InterruptedException {
       Thread_States t1 = new Thread_States();

       System.out.println(t1.getState());  // NEW 
       t1.start();
       System.out.println(t1.getState()); // RUNNABLE 
       Thread.sleep(100);
       System.out.println(t1.getState()); // TIMED_WAITING
       t1.join();  // as main thread calls t1.join(), it waits for thread 't1' to finish its execution before continuing.
       // if 't1' has infinte Loop, then 'main' has to wait indefinitely, to avoid it, we have 'join(timeout)' here
       // t1.join(5000); // waits max 5 seconds
       // Instead of join(), you can use t1.join(5000) → main thread waits at most 5 seconds.
       // After that, it resumes even if t1 is still running.
       System.out.println(t1.getState());
    }
}