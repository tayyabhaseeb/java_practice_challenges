package org.example.threading;

class Counter{
     int count;

    public  synchronized void  incrementCount(){
        count++;
    }
}



public class SyncDemo {
    static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread t1 = new Thread(
                new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 1000; i++) {
                            counter.incrementCount();
                        }
                    }
                }
        );
        Thread t2 = new Thread(
                new Runnable() {
                    public void run() {
                        for (int i = 1; i <= 1000; i++) {
                            counter.incrementCount();
                        }
                    }
                }
        );
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.count);

    }
}
