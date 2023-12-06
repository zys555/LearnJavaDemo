package ten;

public class ThreadDemo3 {
    public static void main(String[] args){
        TestThreadTD3  t = new TestThreadTD3();
        t.start();
        t.start();
        t.start();
        t.start();
    }
}


class TestThreadTD3 extends Thread{
    private int tickets = 5;
    public void run(){
        while (tickets > 0){
            System.out.println(Thread.currentThread().getName() + "出售票" + tickets);
            tickets -= 1;
        }
    }
}