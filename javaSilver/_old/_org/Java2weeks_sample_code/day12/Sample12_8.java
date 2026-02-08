import java.time.*;
class Sample12_8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 7, 12);      //Å¶1
        LocalTime time = LocalTime.of(10, 12, 54);       //Å¶2
        LocalDateTime datetime
        = LocalDateTime.of(2017, 7, 12, 10, 12, 54);     //Å¶3

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
    }
}