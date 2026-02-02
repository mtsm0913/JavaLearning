/*
問題2：要素数を表示しよう
条件
- ArrayList を作る
- 10, 20, 30 を追加
- size() を使って要素数を表示する
*/

import java.util.ArrayList;

class A14060302 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println(nums.size());
    }
}
