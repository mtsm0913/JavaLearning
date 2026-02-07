/*
問題3：削除してみよう
条件
- ArrayList を作成
- "A", "B", "C" を追加
- "B"（インデックス1）を削除
- 最後にリストを2つ表示する
*/

import java.util.ArrayList;

class A14060303 {
    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<>();

        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        // System.out.println(alphabet.size());
        
        alphabet.remove(1);
        
        System.out.println(alphabet.get(0));
        System.out.println(alphabet.get(1));
    }
}
