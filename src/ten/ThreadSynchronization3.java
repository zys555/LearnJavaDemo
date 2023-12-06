package ten;

public class ThreadSynchronization3 {
    public static void main(String[] args){
        TestThreadTS3 t = new TestThreadTS3();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}


class TestThreadTS3 implements Runnable{
    private int tickets = 5;
    public void run(){
        while (tickets > 0){
            sale();
        }
    }

    public synchronized void sale(){
        if(tickets >0 ){
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "出售票" + tickets);

            tickets -= 1;
        }
    }
}