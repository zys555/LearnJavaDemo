package seven;

class PersonTH{
    private String no;
    private String name;
    private House house;
    public PersonTH(String no, String name){
        this.name = name;
        this.no = no;
    }
    public String getPersonInfo(){
        return "人的编号：" + this.no + "姓名："+this.name;
    }
    public void setHouse(House house){
        this.house = house;
    }

    public House getHouse(){
        return this.house;
    }
}

class House{
    private double area;
    private String address;
    private PersonTH person;
    public House(double area, String address){
        this.address = address;
        this.area= area;
    }
    public String getHouseInfo(){
        return "房子的面积："+ this.area + "地址：" + this.address;
    }
    public void setPerson(PersonTH person){
        this.person = person;
    }
    public PersonTH getPerson(){
        return this.person;
    }
}

public class TestHouse {
    public static void main(String[] args){
        PersonTH per = new PersonTH("z101", "张三");
        House ha = new House(88,"二十一世纪大厦");
        per.setHouse(ha);
        ha.setPerson(per);
        System.out.println(per.getPersonInfo());
        System.out.println(per.getHouse().getHouseInfo());
        System.out.println(ha.getPerson().getPersonInfo());
    }
}
