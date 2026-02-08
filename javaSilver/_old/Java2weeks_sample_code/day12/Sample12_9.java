import java.time.*;
class Sample12_9 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2017-07-12");     //Å¶1
        LocalTime time = LocalTime.parse("10:12:54");       //Å¶2
        LocalDateTime datetime
        = LocalDateTime.parse("2017-07-12T10:12:54");       //Å¶3

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
    }
}
