package runner;

import config.ThreadApplication;

public class ReadUserRunner implements Runnable{

    public void run() {
        while (true) {
            System.out.println("准备读，获取user锁");
            synchronized (ThreadApplication.user) {
                System.out.println("开始读");
                System.out.println(ThreadApplication.user.toString());
            }
            Thread.yield();
        }
    }
}
