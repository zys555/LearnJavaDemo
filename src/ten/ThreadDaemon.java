package ten;

public class ThreadDaemon {
    public static void main(String[] args){
        ThreadTestTD  t = new ThreadTestTD();
        Thread tt = new Thread(t);
        tt.setDaemon(true);
        tt.start();
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class ThreadTestTD implements Runnable{
    public void run(){
        for(int i = 0; true; ++i){
            System.out.println(i + " " + Thread.currentThread().getName() + "is running");
        }
    }
}