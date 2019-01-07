package runner;

public class SimpleRunner1 implements Runnable{
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("simpleRunner1");
    }
}
