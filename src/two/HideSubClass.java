package two;

import com.sun.org.apache.bcel.internal.generic.FADD;

class Father{
    public static void overWritting(){
        System.out.println("#### ---father method");
    }
}

class Son extends Father{
    public static void overWritting(){
        System.out.println("##### ---Son method");
    }
}

public class HideSubClass {
    public static void main(String[] args){
        Father dad = new Son();
        dad.overWritting();
        Father.overWritting();
        Son.overWritting();
    }
}
