package config;

import entity.User;
import runner.*;

public class ThreadApplication {

    public static User user = new User();

    public final static Object object = new Object();


    public static void main(String[] args) throws InterruptedException {

//        Thread t1 = new Thread(new SimpleRunner1());
//        t1.start();
//        System.out.println("main");

        //测试stop造成写入一半的脏数据
//        ReadUserRunner readUserRunner = new ReadUserRunner();
//        UpdateUserRunner updateUserRunner = new UpdateUserRunner();
//        Thread readThread = new Thread(readUserRunner
//        );
//        Thread updateThread = new Thread(updateUserRunner);
//        readThread.start();
//        updateThread.start();
//        Thread.sleep(150);
//        updateUserRunner.setStopMe();
//        updateThread.stop();

        //测试线程interrupt
//        Thread thread = new Thread(){
//            public void run(){
//                while (true){
//                    if(Thread.currentThread().isInterrupted()){
//                        System.out.println("线程终止");
//                        break;
//                    }
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        System.out.println("sleep异常");
//                        Thread.currentThread().interrupt();
//                    }
//                    Thread.yield();
//                    System.out.println("线程执行中");
//                }
//            }
//        };
//        thread.start();
//        Thread.sleep(2000);
//        thread.interrupt();

//        Thread T1 = new Thread(new SimpleWait());
//        Thread T2 = new Thread(new SimpleNotify());
//        T1.start();
//        T2.start();

//        Thread bs1 = new BadSuspend("t1");
//        Thread bs2 = new BadSuspend("t2");
//        bs1.start();
//        Thread.sleep(100);
//        bs2.start();
//        bs1.resume();
//        bs2.resume();
//        bs1.join();
//        bs2.join();

//        GoodSuspend gs = new GoodSuspend();
//        GoodSuspendCompany gsc = new GoodSuspendCompany();
//        gs.start();
//        gsc.start();
//        Thread.sleep(1000);
//        gs.suspendMe();
//        System.out.println("suspend t1 2 sec");
//        Thread.sleep(4000);
//        System.out.println("resume t1");
//        gs.resumeMe();

//        Thread[] threads = new Thread[10];
//        for(int i = 0; i< 10; i++) {
//            threads[i] = new Thread(new PlusTask());
//            threads[i].start();
//        }
//        for (int i = 0; i<10; i++) {
//            threads[i].join();
//        }
//        System.out.println(PlusTask.counter);

        Thread noVisibilityThread = new Thread(new NoVisibility());
        noVisibilityThread.start();
        Thread.sleep(1000);
        NoVisibility.number = 40;
        NoVisibility.ready = true;
        Thread.sleep(10000);

    }
}
