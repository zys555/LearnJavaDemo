package eleven;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args)throws Exception{
        File f = new File("SerializedPerson");
        serialize(f);
        deserialize(f);
    }
    public static void serialize(File f)throws Exception{
        OutputStream outputFile = new FileOutputStream(f);
        ObjectOutputStream cout = new ObjectOutputStream(outputFile);
        cout.writeObject(new PersonSD("张三", 25));
        cout.close();
    }
    public static void deserialize(File f)throws Exception{
        InputStream inputFile = new FileInputStream(f);
        ObjectInputStream cin = new ObjectInputStream(inputFile);
        PersonSD p = (PersonSD) cin.readObject();
        System.out.println(p);
        cin.close();
    }
}


@SuppressWarnings("serialize")
class PersonSD implements Serializable{
    private String name;
    private int age;
    public PersonSD(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "姓名:" + this.name + "年龄" + this.age;
    }
}

