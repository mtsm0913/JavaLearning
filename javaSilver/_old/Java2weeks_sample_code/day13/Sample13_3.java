import java.util.function.Function;
class MyFunction implements Function<Integer, String> {     //※1
    public String apply(Integer i) {
        return "整数:" + i;
    }
}
class Sample13_3 {
    public static void main(String[] args) {
        MyFunction mf = new MyFunction();
        String str = mf.apply(100);          　　　　　　　　//※2
        System.out.println(str);
     }
}
