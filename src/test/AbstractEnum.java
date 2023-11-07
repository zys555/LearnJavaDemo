package test;

enum NewColor3{
    红色 // 每个枚举对象都需要实现所定义的抽象方法
            {
                public String getColor(){
                    return "RED";
                }
            },
    绿色{
        public String getColor(){
            return "GREEN";
        }
    },
    蓝色{
        public String getColor(){
            return "BLUE";
        }
    };
    public abstract String getColor(); //定义抽象方法
}

public class AbstractEnum {
    public static void main(String[] args){
        for(NewColor3 c:NewColor3.values()){
            System.out.println(c.ordinal()+"--->"+ c.name() + "--->"+ c.getColor());
        }
    }
}
