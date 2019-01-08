package runner;

import config.ThreadApplication;

public class SimpleNotify implements Runnable{
    public void run() {
        synchronized (ThreadApplication.object) {
            System.out.println(System.currentTimeMillis()+":T2 start, notify one thread");
            ThreadApplication.object.notify();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println(System.currentTimeMillis()+":T2 end");
        }
    }
}
