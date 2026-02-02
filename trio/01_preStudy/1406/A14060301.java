/*
問題1：名前リストを作ろう
条件
- ArrayList を作る
- "Apple", "Banana" の順に追加
- 2つを順番に表示する
*/

import java.util.ArrayList;

class A14060301 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        System.out.println(names.get(0));
        System.out.println(names.get(1));
    }
}
