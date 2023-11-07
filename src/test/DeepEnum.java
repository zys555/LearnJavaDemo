package test;

enum NewColor{
    RED("红色",4),GREEN("绿色",5),BLUE("蓝色",6);
    private String name;
    private int index;
    private NewColor(String name, int index){
        this.name = name;
        this.index = index;
    }
    public static String getName(int index){
        for(NewColor c:NewColor.values()){
            if(c.getIndex() == index){
                return c.name;
            }
        }
        return null;
    }
    public String getName(){ return name; }

    public static void setName(int index, String name){
        for(NewColor c:NewColor.values()){
            if(c.getIndex() == index){
                c.name = name;
                return;
            }
        }
    }

    public int getIndex(){ return index; }

    public static void setIndex(int index, String name){
        for(NewColor c:NewColor.values()){
            if(c.getName() == name){
                c.index = index;
                return;
            }
        }
    }


}

public class DeepEnum {

    public static void main(String[] args){
        System.out.println("输出枚举中的元素");
        System.out.println(NewColor.RED.getIndex() + "---->" + NewColor.RED.getName());
        System.out.println(NewColor.GREEN.getIndex() + "---->" + NewColor.GREEN.getName());
        System.out.println(NewColor.BLUE.getIndex() + "---->" + NewColor.BLUE.getName());
        System.out.println("------在自定义编号和属性值之后，测试-----------");
        NewColor.setName(4, "肉色");
        System.out.println(NewColor.getName(4));
        NewColor.setName(7,"黑色");
        System.out.println(NewColor.getName(7));

    }
}
