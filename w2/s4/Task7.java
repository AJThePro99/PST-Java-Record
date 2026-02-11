import java.time.LocalDate;

public class Task7 {

    public static void main(String[] args) {
        int day = 15;
        int month = 4;
        int year = 2000;

        System.out.println("Day is " + findDay(year, month, day));
    }

    public static String findDay(int year, int month, int day) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
}
