import java.time.*;
class Test12_10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 1, 1);
        date = date.plusMonths(-1);
        date.plusYears(2);
        System.out.println(date);
    }
}