package five;

public class GetMemorySize {
    public static void main(String[] args){
        Runtime run = Runtime.getRuntime();
        String str = "";
        for(int x= 0;x < 5000; x++){
            str+=x;
        }

        System.out.println("1、最大可用内存" + run.maxMemory());
        System.out.println("1、总共可用内存" + run.totalMemory());
        System.out.println("1、最大可用内存" + run.freeMemory());

        run.gc();
        System.out.println("-----------------------------");
        System.out.println("2、最大可用内存" + run.maxMemory());
        System.out.println("2、总共可用内存" + run.totalMemory());
        System.out.println("2、最大可用内存" + run.freeMemory());

    }
}
