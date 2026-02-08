import java.time.*;
class Sample12_7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();               //Å¶1
        LocalTime time = LocalTime.now();               //Å¶2
        LocalDateTime datetime = LocalDateTime.now();   //Å¶3

        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
    }
}