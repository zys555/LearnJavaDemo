package five;


import java.math.BigInteger;

public class BigNumDemo01 {
    public static void main(String[] args){
        BigInteger big = new BigInteger("8955546655544585");
        BigInteger bigB = new BigInteger("985625");
        System.out.println("加法操作：" + big.add(bigB));
        System.out.println("减法操作：" + big.subtract(bigB));
        System.out.println("乘法操作：" + big.multiply(bigB));
        System.out.println("除法操作：" + big.divide(bigB));

        BigInteger result[] = big.divideAndRemainder(bigB);
        System.out.println("商："+result[0]+"余数" +result[1]);
    }
}
