package runner;

import config.ThreadApplication;

public class GoodSuspend extends Thread
{

    volatile boolean suspendMe = false;

    public void suspendMe() {
        suspendMe = true;
    }

    public void resumeMe() {
        suspendMe = false;
        synchronized (this) {
            notify();
        }
    }
    public void run() {
        while (true) {
            synchronized (this) {
                while (suspendMe) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            synchronized (ThreadApplication.object) {
                System.out.println("in change");
            }
            Thread.yield();
        }
    }
}