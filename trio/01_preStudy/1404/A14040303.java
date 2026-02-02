/*
問題3：1〜3 を3回くりかえして表示しよう
条件
- 外側：3回繰り返す
- 内側：1〜3 を表示する
- 改行は外側の最後で行う
*/

class A14040303 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
