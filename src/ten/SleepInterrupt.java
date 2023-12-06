package ten;

public class SleepInterrupt implements Runnable {
    public void run(){
        try{
            System.out.println("在run方法中这个线程休眠10秒");
            Thread.sleep(10000);
            System.out.println("在run()方法中继续执行");
        }catch (InterruptedException e){
            System.out.println("在run（）方法中 中断线程");
            return;
        }
        System.out.println("在run()方法中 休眠之后继续完成");
        System.out.println("在run()方法中 正常退出");
    }

    public static void main(String[] args){
        SleepInterrupt si = new SleepInterrupt();
        Thread t = new Thread(si);
        t.start();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("在main（）方法中 中断其他线程");
//        t.interrupt();
        System.out.println("在main（）方法中  退出");
    }
}

