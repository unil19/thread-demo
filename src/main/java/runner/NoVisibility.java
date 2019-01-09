package runner;

public class NoVisibility implements Runnable{
    public volatile static boolean ready;
    public volatile static int number;
    public void run() {
        while (!ready);
        System.out.println(number);
    }
}
