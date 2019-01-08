package runner;

import config.ThreadApplication;

import java.util.Random;

public class SimpleWait implements Runnable{

    private int randomInt;

    public SimpleWait(){
        randomInt = new Random().nextInt(10000);
    }
    public void run() {
        synchronized (ThreadApplication.object) {
            System.out.println(System.currentTimeMillis()+":T1:"+randomInt+" start");
            try {
                System.out.println(System.currentTimeMillis()+ ":T1:" + randomInt +" wait for object");
                ThreadApplication.object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(System.currentTimeMillis()+":T1:" + randomInt + "end");
        }
    }
}
