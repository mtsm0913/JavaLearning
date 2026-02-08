import java.time.*;
import java.time.format.*;
class Sample12_10 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();                  //Å¶1
        System.out.println(dt);

        DateTimeFormatter formatter1
        = DateTimeFormatter.ISO_DATE;                            //Å¶2
        System.out.println(formatter1.format(dt));               //Å¶3

        DateTimeFormatter formatter2
        = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");    //Å¶4
        System.out.println(formatter2.format(dt));               //Å¶5
    }
}