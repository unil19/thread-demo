package config;

import entity.User;
import runner.ReadUserRunner;
import runner.SimpleRunner1;
import runner.UpdateUserRunner;

public class ThreadApplication {

    public static User user = new User();

    public static void main(String[] args) throws InterruptedException {

//        Thread t1 = new Thread(new SimpleRunner1());
//        t1.start();
//        System.out.println("main");

        //测试stop造成写入一半的脏数据
        ReadUserRunner readUserRunner = new ReadUserRunner();
        UpdateUserRunner updateUserRunner = new UpdateUserRunner();
        Thread readThread = new Thread(readUserRunner
        );
        Thread updateThread = new Thread(updateUserRunner);
        readThread.start();
        updateThread.start();
        Thread.sleep(150);
//        updateUserRunner.setStopMe();
        updateThread.stop();
    }
}