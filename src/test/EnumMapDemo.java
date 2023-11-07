package test;
import java.util.EnumMap;
import java.util.Map;

enum Color2{红色,蓝色,绿色}

public class EnumMapDemo {
    public static void main(String[] args){
        EnumMap<Color2, String>eMap=new EnumMap<Color2, String>(Color2.class);
        eMap.put(Color2.红色,"RED");
        eMap.put(Color2.绿色,"GREEN");
        eMap.put(Color2.蓝色,"BLUE");
        for(Map.Entry<Color2, String> me:eMap.entrySet()){
            System.out.println(me.getKey() + "--->>"+me.getValue());
        }
    }
}
