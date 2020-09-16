import java.time.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NewYear {
        public static void main(String[] args) {

            LocalDate today = LocalDate.now();

            //how many days are left until the new year?
            LocalDate newYearDate = LocalDate.of(today.getYear(), 12, 31);
            LocalDateTime newYear = LocalDateTime.of(newYearDate, LocalTime.of(12, 0));

            LocalDateTime todayWithTime = LocalDateTime.now();
            System.out.println(ChronoUnit.DAYS.between(todayWithTime, newYear));
        }
    }
