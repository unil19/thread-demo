package runner;

public class PlusTask implements Runnable{

    public static int counter = 0;
    public void run() {
        for(int i = 0; i < 10000; i++) {
            counter ++;
        }
    }
}
