package ten;

public class ThreadDemo4 {
    public static void main(String[] args){
        new TestThreadTD4().start();
        new TestThreadTD4().start();
        new TestThreadTD4().start();
        new TestThreadTD4().start();
    }
}

class TestThreadTD4 extends Thread{
    private int tickets = 5;
    public void run(){
        while (tickets > 0){
            System.out.println(Thread.currentThread().getName()+ "出售票" + tickets);
            tickets -= 1;
        }
    }
}