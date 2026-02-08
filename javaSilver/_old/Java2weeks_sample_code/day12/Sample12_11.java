import java.time.*;
class Sample12_11 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 12, 25);       //Å¶1
        System.out.println(date);

        date = date.plusYears(1);                          //Å¶2
        System.out.println(date);

        date = date.plusMonths(1);                         //Å¶3
        System.out.println(date);

        date = date.plusDays(1);                           //Å¶4
        System.out.println(date);
    }
}