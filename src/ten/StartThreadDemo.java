package ten;

public class StartThreadDemo extends Thread {
    public void run(){
        for(int i = 0; i < 5; ++i){
            printMsg();
        }
    }
    public void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name" + name);
    }

    public static void main(String[] args){
        StartThreadDemo t = new StartThreadDemo();
        t.setName("test Thread");
        System.out.println("调用start（）方法前，t.isAlive()=" + t.isAlive());
        t.start();
        System.out.println("刚调用start（）方法前，t.isAlive()=" + t.isAlive());
        for(int i = 0; i < 5; ++i){
            t.printMsg();
        }
        System.out.println("main()方法结束时，t.isAlive()=" + t.isAlive());
    }
}
