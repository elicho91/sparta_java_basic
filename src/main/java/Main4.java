import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("now()를 활용하여 생성");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println("of()를 활용하여 생성");
        LocalDate newDate = LocalDate.of(2021, 03, 29);
        LocalTime newTime = LocalTime.of(22, 50, 55);

        System.out.println(newDate);
        System.out.println(newTime);
    }
}