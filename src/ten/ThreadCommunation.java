package ten;


class Producer implements Runnable{
    Person p = null;
    public Producer(Person p){
        this.p = p;
    }
    public void run(){
        for(int i = 0; i< 10; ++i){
            if(i % 2 == 0){
                p.name = "张三";
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                p.sex = "男";
            }else {
                p.name = "李四";
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                p.sex = "女";
            }
        }
    }
}

class Consumer implements Runnable{
    Person q = null;
    public Consumer(Person q){
        this.q = q;
    }
    public void run(){
        for(int i = 0; i < 10; ++i){
            System.out.println(q.name+ "----->" + q.sex);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Person{
    String name = "李四";
    String sex = "女";
}

public class ThreadCommunation {
    public static void main(String[] args){
        Person q = new Person();
        new Thread(new Producer(q)).start();
        new Thread(new Consumer(q)).start();
    }
}
