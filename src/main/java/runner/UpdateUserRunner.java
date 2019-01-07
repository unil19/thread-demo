package runner;

import config.ThreadApplication;

import java.util.Random;

public class UpdateUserRunner implements Runnable{

    public static boolean stopMe = false;

    public void run() {
        while (true) {
            if(stopMe) {
                break;
            }
            System.out.println("准备写，获取user锁");
            synchronized (ThreadApplication.user){
                System.out.println("开始写");
                Random random = new Random();
                int id = random.nextInt(10000);
                String name = String.valueOf(id);
                ThreadApplication.user.setId(id);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ThreadApplication.user.setName(name);
            }
            Thread.yield();
        }
    }

    public void setStopMe(){
        stopMe = true;
    }
}
