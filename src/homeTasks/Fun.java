package homeTasks;

import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;

public class Fun {

    public static void main(String[] args) {
        System.out.println(Calendar.getInstance().get(Calendar.YEAR)); // текущий год
        System.out.println(Year.now().getValue()); // вариант №2 (system's default time zone)
        System.out.println(LocalDate.now().getYear()); // вариант №3
    }
}
