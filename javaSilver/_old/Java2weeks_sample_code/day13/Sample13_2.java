import java.util.*;
class Sample13_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //Å¶1

        list.add(10);                                //Å¶2
        list.add(20);
        list.add(1, 30);                             //Å¶3

        System.out.println(list);                    //Å¶4
    }
}