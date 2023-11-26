package eight;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args){
        Properties capitals = new Properties();
        Set<Object>states;
        String str;
        capitals.put("中国","北京");
        capitals.put("俄罗斯","莫斯科");
        capitals.put("日本","东京");
        capitals.put("法国","巴黎");
        capitals.put("英国","伦敦");

        states= capitals.keySet();
        Iterator<Object> iter = states.iterator();
        while (iter.hasNext()){
            str = (String)iter.next();
            System.out.println(str+" : " + capitals.getProperty(str));
        }
        System.out.println();
        str = capitals.getProperty("美国","没有发现");
        System.out.println("美国的首都" + str);
    }
}
