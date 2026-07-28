package org.example.threading;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Hi implements Runnable{
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

        }

    }

}

 class Hello implements Runnable {
    public void run(){
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}

        }
    }

}


public class Main {
    static void main() throws InterruptedException {

        Runnable obj1 = new Hi();
        Runnable obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());

        System.out.println("Bye");




        }
    }

