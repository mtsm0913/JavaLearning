import java.util.function.Predicate;
class Sample13_5 {
    public static void main(String[] args) {
        Predicate<Integer> pre = (Integer x) -> {        //Å¶1
            return x % 2 == 0;
        };

        System.out.println(pre.test(10));                //Å¶2
     }
}