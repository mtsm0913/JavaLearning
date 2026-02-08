import java.time.*;
class Test14_26 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 1, 2);
        time = time.plusSeconds(59);
        System.out.println(time);
    }
}
