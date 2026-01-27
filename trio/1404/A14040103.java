/*
問題3：回数つきのメッセージを表示しよう
条件
- 1〜4の数字を使って
 「1回目です」「2回目です」…のように4行表示する
- 文字列結合を使う
*/

class A14040103 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + "回目です");
        }
    }
}
