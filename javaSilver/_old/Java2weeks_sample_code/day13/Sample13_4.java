import java.util.function.Predicate;
class MyPredicate implements Predicate<Integer > {      //Å¶1
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}
class Sample13_4 {
    public static void main(String[] args) {
        MyPredicate predicate = new MyPredicate();
        boolean result = predicate.test(10);               //Å¶2
        System.out.println(result);
    }
}
