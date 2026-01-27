/*
問題1：2行3列の表を表示しよう
条件
- 二重 for文を使う
- 「(i, j)」の形式で表示する
- i は 1〜2、j は 1〜3
*/

class A14040301 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }
    }
}
