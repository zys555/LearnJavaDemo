package ten;

class ProducerTC implements Runnable{
    PersonTC q = null;
    public ProducerTC(PersonTC q){
        this.q = q;
    }
    public void run(){
        for(int i = 0; i < 10; ++i){
            if(i % 2 ==0){
                q.set("张三", "男");
            }else {
                q.set("李四", "女");
            }
        }
    }

}

class ConsumerTC implements Runnable{
    PersonTC q = null;
    public ConsumerTC(PersonTC q){
        this.q = q;
    }
    public void run(){
        for(int i = 0; i < 10; ++i){
            q.get();
        }
    }
}

class PersonTC {
    private String name = "李四";
    private String sex = "女";
    public synchronized void set(String name, String sex){
        this.name = name;
        this.sex = sex;
    }
    public synchronized void get(){
        System.out.println(this.name + "----->>>" + this.sex);
    }
}

public class ThreadCommunation2 {
    public static void main(String[] args){
        PersonTC q = new PersonTC();
        new Thread(new ProducerTC(q)).start();
        new Thread(new ConsumerTC(q)).start();
    }
}
