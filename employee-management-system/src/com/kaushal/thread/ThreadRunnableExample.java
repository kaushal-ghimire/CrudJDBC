package com.kaushal.thread;

public class ThreadRunnableExample implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread Example by implementing runnable interface");
    }

    public static void main(String[] args) {

        ThreadRunnableExample toRun = new ThreadRunnableExample();
        Thread thread = new Thread(toRun);
        thread.start();
    }
}
