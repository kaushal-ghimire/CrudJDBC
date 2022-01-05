package com.kaushal.thread;

public class ThreadExample extends Thread {

    @Override
    public void run(){
        System.out.println("Thread Example by extending thread class");
    }

    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();
        thread.start();
    }
}
