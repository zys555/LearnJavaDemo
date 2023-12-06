package ten;

public class ThreadDemo2 {
    public static void main(String[] args){
        new TestThreadTD().start();
        for(int i = 0; i < 5; ++i){
            System.out.println("main线程在运行");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class TestThreadTD extends Thread{
    public void run(){
        for(int i = 0; i < 5;++i){
            System.out.println("TestThreadTD 在运行");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}