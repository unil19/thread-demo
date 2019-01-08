package runner;


public class BadSuspend extends Thread{

    public final static Object object = new Object();

    public BadSuspend(String name) {
        super.setName(name);
    }
    @Override
    public void run() {
        synchronized (object){
            System.out.println("in "+ super.getName());
            Thread.currentThread().suspend();
        }
    }
}
