package test;

public class Color {
    private String name;
    public static final Color RED = new Color("红色");
    public static final Color GREEN = new Color("绿色");
    public static final Color BLUE = new Color("蓝色");

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    private Color(String name){
        setName(name);
    }

    public static Color getInstance(int i){
        if(i ==0 ){ return RED; }
        if(i ==1 ){ return GREEN; }
        if(i ==2 ){ return BLUE; }
        return null;
    }

    public static void main(String [] args){
        Color c1 = Color.getInstance(0);
        System.out.println(c1.getName());

        Color c2 = Color.getInstance(1);
        System.out.println(c2.getName());

        Color c3 = Color.getInstance(2);
        System.out.println(c3.getName());
    }


}
