package ten;

public class RunnableDemo {
    public static void main(String[] args){
        TestThreadRD t = new TestThreadRD();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class TestThreadRD implements Runnable{
    private int tickets = 5;
    public void run(){
        while (tickets > 0){
            System.out.println(Thread.currentThread().getName() + "出售票" + tickets);
            tickets -= 1;
        }
    }
}