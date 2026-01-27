/*
問題3：パスワード一致判定
条件
- String pass = "abc"
- 入力値 input = "abc"
- 同じなら「OK」
*/

class a_14_3_3_03 {
    public static void main(String[] main) {
        String pass = "abc";
        String input = "abc";
        // String input = "ac";
        // String input = "abcd";
        // if (input == pass) System.out.println("OK");
        if (input.equals(pass)) System.out.println("OK");
    }
}
