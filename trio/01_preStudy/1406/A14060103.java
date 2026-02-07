/*
問題3：配列の値を書き換えてみよう
条件
- int[] points = {50, 60, 70};
- 2つ目（インデックス1）の値を 100 に変更
- その値を表示する
*/

class A14060103 {
    public static void main(String[] args) {
        int[] points = {50, 60, 70};
        points[1] = 100;
        System.out.println(points[1]);
    }
}
