package com.kaushal.thread;

public class CircleThreadExample implements Runnable {
    private int radius;
    private static final Double pi = 3.14;

    public CircleThreadExample(int r) {
        this.radius = r;
    }

    @Override
    public void run(){
        System.out.println("Area");
        area(5);
    }
    public double area(int r){
        return Math.PI*Math.pow(r,2);
    }

    public static void main(String[] args) {

        CircleThreadExample circle = new CircleThreadExample(10);
        circle.area(6);
        Thread thread = new Thread(circle);
        thread.start();
    }
}
