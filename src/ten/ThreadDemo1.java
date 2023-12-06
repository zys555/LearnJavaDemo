package ten;

public class ThreadDemo1 {
    public static void main(String[] args){
        new TestThread().run();
        for (int i = 0; i < 5; ++i){
            System.out.println("main 线程正在运行");
        }
    }
}


class TestThread{
    public void run(){
        for(int i = 0; i< 5; ++i){
            System.out.println("TestThread 正在运行");
        }
    }
}