package test;

public class TestSingleDemo {
    public static void main(String[] args){
        PersonTs p ;
         p = PersonTs.getPersonTs();
         System.out.println("姓名" + p.name);
    }
}

class PersonTs {
    String name;
    private static final PersonTs PERSON_TS = new PersonTs();
    private PersonTs(){
        name = "kehr";
    }
    public static PersonTs getPersonTs(){
        return PERSON_TS;
    }
}
