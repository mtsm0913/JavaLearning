/*
問題2：1〜10の合計を求める
条件
 for文で合計値を算出
*/

class A14070202 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
    }
}
