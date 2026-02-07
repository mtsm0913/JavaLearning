/*
問題15：password の長さチェック
条件
- String pass = "abcd"
- 長さが 4 未満なら「短すぎ」
*/

class a_14_3_3_15 {
    public static void main(String[] args) {
        String pass = "abcd";
        if (pass.length() < 4) {
            System.out.println("短すぎ");
        } else {
            System.out.println("OK");
        }
    }
}
