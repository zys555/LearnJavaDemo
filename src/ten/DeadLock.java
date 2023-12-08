package ten;

// 模拟死锁的发生
public class DeadLock {
    static String knife = "餐刀",fork = "叉子";
    static class A extends Thread{
        public void run(){
            synchronized (knife){
                System.out.println("甲拿起了" + knife + ",等待"+fork+"...");
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){ }
                synchronized (fork){
                    System.out.println("甲又拿起了" + fork);
                }
            }
        }
    }

    static class B extends Thread{
        public void run(){
            synchronized (fork){
                System.out.println("乙拿起了" + fork + "等待" + knife + "...");
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){ }
                synchronized (knife){
                    System.out.println("乙又拿起了," + knife);
                }
            }
        }
    }

    static class Demo extends Thread{
        public Demo(){
            this.setDaemon(true);
        }
        public void run(){
            while (true){
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){ }
                System.out.println("守护线程： 程序正在运行中...");
            }
        }
    }
    public static void main(String[] args){
        new A().start();
        new B().start();
        new Demo().start();
    }
}
