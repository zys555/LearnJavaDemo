package five;

import java.math.BigDecimal;

public class CalculateBigDecimal {
    public static void main(String[] args){


         BigDecimal bigA=new BigDecimal("8793247892437928.2");
             BigDecimal bigB=new BigDecimal("9202309.6");
             System.out.println("加法操作："+bigA.add(bigB));
            System.out.println("减法操作："+bigA.subtract(bigB));
             System.out.println("乘法操作："+bigA.multiply(bigB));
            System.out.println("除法操作："+bigA.divide(bigB,BigDecimal.ROUND_DOWN));
            System.out.println("进一法保留一位小数：" + bigA.multiply(bigB).setScale(1, BigDecimal.
                ROUND_UP));
    }
}

