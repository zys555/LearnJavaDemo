package ten;

public class GetNameThreadDemo extends Thread{
    public void run(){
        for(int i = 0; i < 3; ++i){
            printMsg();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

    public void printMsg(){
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name = " + name);
    }

    public static void main(String[] args){
        GetNameThreadDemo t1 = new GetNameThreadDemo();
        t1.start();
        for(int i = 0; i < 3; ++i){
            t1.printMsg();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
