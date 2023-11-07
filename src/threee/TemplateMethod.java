package threee;

import org.omg.PortableServer.THREAD_POLICY_ID;

abstract class Action{
    public static final int EAT = 1;
    public static final int WORK = 2;
    public static final int SLEEP = 5;
    public static final int RUN = 10;

    public abstract void eat();
    public abstract void work();
    public abstract void sleep();
    public abstract void run();

    public void command(int ch){
        switch (ch){
            case EAT:
                this.eat();
                break;
            case WORK:
                this.work();
                break;
            case SLEEP:
                this.sleep();
                break;
            case RUN:
                this.run();
                break;
            case EAT + WORK:
                this.eat();
                this.work();
                break;
            case EAT + SLEEP + RUN:
                this.eat();
                this.work();
                this.run();
                break;
            case EAT + SLEEP + RUN + WORK:
                this.eat();
                this.sleep();
                this.run();
                this.work();
                break;
        }
    }
}

class Robot extends Action{
    public void eat(){
        System.out.println("为机器人添加燃料.");
    }
    public void work(){
        System.out.println("让机器人开始工作");
    }
    public void sleep(){}
    public void run(){}

}

class Woman extends Action{
    public void eat(){
        System.out.println("吃饭");
    }
    public void work(){

    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void run(){
        System.out.println("跑步");
    }
}

class Man extends Action{
    public void eat(){
        System.out.println("吃饭 吃大餐 吃满汉全席");
    }
    public void work(){
        System.out.println("工作 1小时 50万薪酬");
    }
    public void run(){
        System.out.println("跑步 跑出八块腹肌");
    }
    public void sleep(){
        System.out.println("睡觉抱着狗");
    }
}

public class TemplateMethod {
    public static void main(String[] args){
        Action acA =new Robot();
        acA.command(Action.EAT);
        acA.command(Action.WORK);
        Action acB = new Woman();
        acB.command(Action.EAT+Action.SLEEP+Action.RUN);

        Action acC = new Man();
        acC.command(Action.EAT + Action.RUN + Action.WORK + Action.SLEEP);
    }
}
