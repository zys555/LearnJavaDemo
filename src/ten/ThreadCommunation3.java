package ten;

class ProducerTC3 implements Runnable{
    PersonTC3 q = null;
    public ProducerTC3(PersonTC3 q){
        this.q = q;
    }
    public void run(){
        for(int i = 0; i < 10; ++i){
            if(i % 2 == 0){
                q.set("张三","男");
            }else {
                q.set("李四", "女");
            }
        }
    }
}

class ConsumerTC3 implements Runnable{
    PersonTC3 q = null;
    public ConsumerTC3(PersonTC3 q){
        this.q = q;
    }
    public void run(){
        for (int i = 0; i < 10; ++i){
            q.get();
        }
    }
}

class PersonTC3{
    private String name = "李四";
    private String sex = "女";
    private boolean bFull = false;
    public synchronized void set (String name, String sex){
        if(bFull){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        this.name = name;
        this.sex = sex;
        bFull = true;
        notify(); // 唤醒最先到达的线程
    }

    public synchronized void get(){
        if(!bFull){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println(name + "---->>>" + sex);
        bFull= false;
        notify();
    }
}

public class ThreadCommunation3 {
    public static void main(String[] args){
        PersonTC3 q = new PersonTC3();
        new Thread(new ProducerTC3(q)).start();
        new Thread(new ConsumerTC3(q)).start();
    }
}
