package ten;

public class threadSynchronization {
    public static void main(String[] args){
        TestThreadTS t = new TestThreadTS();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}

class TestThreadTS implements Runnable{
    private int tickets = 5;
    public void run(){
        while (tickets > 0){
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "出售票" + tickets);
            tickets -=1;
        }
    }
}