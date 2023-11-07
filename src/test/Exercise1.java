package test;

enum WeekDay{Sun, Mon, Tue, Wed, Thu, Fri, Sat}

public class Exercise1 {
    public static void print(String week){
        System.out.println("Do " + week+ " work");
    }


    public static void main(String[] args){
        WeekDay wd = WeekDay.Mon;

        System.out.println("wd ----->>>>" + wd);

        switch (wd){
            case Fri:
                print("Friday");
                break;
            case Mon:
                print("Monday");
                break;
            case Sat:
                print("Saturday");
                break;
            case Sun:
                print("Sunday");
                break;
            case Thu:
                print("Thursday");
                break;
            case Tue:{
                print("Tuesday");
                break;
            }
            case Wed:
                print("Wednesday");
                break;
            default:
                System.out.println("我不知道你要表达什么");
        }
    }
}
