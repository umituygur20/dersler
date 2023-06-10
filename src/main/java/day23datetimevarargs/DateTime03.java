package day23datetimevarargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

        LocalDateTime  ltd = LocalDateTime.now();
        System.out.println(ltd); // 2023-06-10T22:21:37.231822300

        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("♥ MM**dd**yyyy ++++ hh:mm a"); //--Flexibel //06/10/2023 10:27
        String formattedLdt = dtf.format(ltd);
        System.out.println(formattedLdt);

    }
}
