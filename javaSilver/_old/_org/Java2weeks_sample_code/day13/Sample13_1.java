import java.util.*;
class Sample13_1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();        //Å¶1

        list.add("Tokyo");
        list.add("Kanagawa");                              //Å¶2
        list.add("Hiroshima");

        for(int i = 0; i < list.size(); i++) {           //Å¶3
            System.out.println(list.get(i));
        }
    }
}