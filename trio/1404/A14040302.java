/*
問題2：3行4列で「*」を表示しよう
条件
- print と println を使い分ける
- 一行に4つ「*」を並べる
- これを3行表示する
*/

class A14040302 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
