import java.util.*;
class Test14_28 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Victor");
        list.removeIf(element -> element.length() % 2 != 0);
        System.out.print(list);
    }
}
