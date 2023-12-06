package ten;

public class ThreadJoin {
    public static void main(String[] args){
        ThreadTestTJ t = new ThreadTestTJ();
        Thread pp = new Thread(t);
        pp.start();
        int i = 0;
        for(int x = 0; x < 5; x++){
            if(i==3){
                try{
                    pp.join();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("main Thread" + i);
            i +=1;
        }
    }
}

class ThreadTestTJ implements Runnable{
    public void run(){
        int i = 0;
        for(int x = 0; x < 5; ++x){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "----->>" + i);
        }
    }
}