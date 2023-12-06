package ten;

public class GetSetNameThreadDemo implements Runnable {
    public void run(){
        Thread temp = Thread.currentThread();
        System.out.println("执行这条语句的线程名字:  " + temp.getName());
    }

    public static void main(String[] args){
        Thread t = new Thread(new GetSetNameThreadDemo());
        t.setName("线程_范例22-8");
        t.start();
    }
}
