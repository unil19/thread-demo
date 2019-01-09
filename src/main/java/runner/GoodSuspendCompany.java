package runner;

import config.ThreadApplication;

public class GoodSuspendCompany extends Thread{
    public void run() {
        while (true) {
            synchronized (ThreadApplication.object){
                System.out.println("in read");
            }
            Thread.yield();
        }
    }
}
