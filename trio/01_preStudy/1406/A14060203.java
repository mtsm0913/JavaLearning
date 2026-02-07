/*
問題3：合計を計算しよう
条件
- int[] scores = {10, 20, 30};
- for-eachで合計を計算して表示する
- インデックスは使わない
*/

class A14060203 {
    public static void main(String[] args) {
        int[] scores = {10, 20, 30};
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println(sum);
    }
}
