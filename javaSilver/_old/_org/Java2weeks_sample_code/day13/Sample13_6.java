import java.util.ArrayList;
class Sample13_6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();           //Å¶1
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.removeIf((Integer x) -> { return x % 2 == 0; });   //Å¶2

        System.out.println(list);
     }
}
