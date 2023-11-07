package five;

import java.time.*;
import java.time.format.*;

public class DateFormatDemo {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        String str = localDate.format(f);
        System.out.println("时间" + str);
    }
}
