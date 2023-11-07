package threee;

interface InterfaceD{
    default public void otherprint(){
        System.out.println("print default method only in interfaceD");
    }
}

class InterfaceCD implements InterfaceD{

}

public class Interfacedefaultonly {
    public static void main(String[] args){
        InterfaceCD cd = new InterfaceCD();
        cd.otherprint();
    }
}
