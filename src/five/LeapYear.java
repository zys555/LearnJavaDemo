package five;

import java.time.*;

public class LeapYear {
    public static void main(String[] args){
        // 用指定的年获取一个Year
        Year year1 = Year.of(2012);
        // 从Year获取YearMonth
        YearMonth yearMonth = year1.atMonth(2);
        // YearMonth指定日得到LocalDate
        LocalDate localDate2 = yearMonth.atDay(29);
        System.out.println("时间" + localDate2);

        // 判断是否是闰年
        System.out.println("是否为闰年："+ localDate2.isLeapYear());
        // 自动处理闰年的2月日期
        // 创建一个MonthDay
        MonthDay monthDay = MonthDay.of(2,29);
        LocalDate leapYear = monthDay.atYear(2012);
        System.out.println("闰年" + leapYear);
        // 同一个MonthDay关联到另一个年份上
        LocalDate nonLeapYear = monthDay.atYear(2014);
        System.out.println("非闰年：" + nonLeapYear);

    }
}
