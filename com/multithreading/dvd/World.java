package com.multithreading.dvd;
// this method implements the thread class, hence even if the loop is infinite, Both 'Hello' and 'World' get printed. 
public class World extends Thread {
    @Override
    public void run(){
        for(; ;){
           // System.out.println("World");
                        System.out.println(Thread.currentThread().getName());

        }
    }
}