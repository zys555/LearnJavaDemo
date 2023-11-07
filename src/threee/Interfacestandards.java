package threee;

interface USB{
    public void work();
}

class Computer{

    public void plugin(USB usb){
        usb.work();
    }
}

class Print implements USB{
    public void work(){
        System.out.println("打印机用USB接口，连接开始工作");
    }
}

class Flash implements USB{
    public void work(){
        System.out.println("u盘使用usb接口,连接开始工作");
    }
}

public class Interfacestandards {
    public static void main(String[] args){
        Computer com = new Computer();
        com.plugin(new Print());
        com.plugin(new Flash());
    }
}
