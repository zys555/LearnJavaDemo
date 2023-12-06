package ten;

public class RunnableThread {
    public static void main(String[] args){
        TestThreadRT t = new TestThreadRT();
        new Thread(t).start();
        for(int i = 0; i < 5; i++) {
            System.out.println("main 线程正在运行");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class TestThreadRT implements Runnable{
    public void run(){
        for(int i = 0; i< 5; i++){
            System.out.println("TestThread正在运行");

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}