package test;

class RecursionMethod {
    public int addNonrecursion(int n){
        int result = 0;
        for (int i = 1; i<=n;++i){
            result += i;
        }
        return result;
    }
    public int addRecursion(int n){
        if(n <= 1) return n;
        return n+addRecursion(n-1);
    }

    public static void main(String[] args){
        RecursionMethod test = new RecursionMethod();
        int result = test.addNonrecursion(10);
        System.out.println("非递归结果" + result);
        result = test.addRecursion(10);
        System.out.println("递归结果" + result);
    }

}
