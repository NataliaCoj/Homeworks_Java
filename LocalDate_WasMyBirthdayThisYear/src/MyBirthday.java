import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class MyBirthday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        //System.out.println(today.format(DateTimeFormatter.ISO_DATE));

        //format Date in dd.MM.yyyy
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Present date: " + today.format(dateTimeFormatter));

        //my birthday date this year
        LocalDate birthday = LocalDate.of(2020,5,16);
        System.out.println("My birthday this year: " + birthday.format(dateTimeFormatter));

        //this year my birthday already was?
        LocalDate drThisYear = LocalDate.of(LocalDate.now().getYear(), Month.MAY, 16);
        System.out.println("This year my birthday already was?: " + drThisYear.isBefore(today));

        //LocalDate birthday = LocalDate.parse("2020/05/16", dateTimeFormatter);
        //System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
