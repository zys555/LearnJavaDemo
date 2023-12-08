package ten;

public class ThreadLife {
    public static void main(String[] args){
        TestThreadTL t = new TestThreadTL();
        new Thread(t).start();
        for (int i = 0; i < 10; ++i){
            if(i == 5 ){
                t.stopMe();
            }
            System.out.println("main 线程在运行");
        }
    }
}

class TestThreadTL implements Runnable{
    private boolean bFlag = true;
    public void stopMe(){
//        bFlag = false;
    }
    public void run(){
        while (bFlag){
            System.out.println(Thread.currentThread().getName() +"在运行");
        }
    }
}