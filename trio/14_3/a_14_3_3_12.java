/*
問題12：論理演算 AND を使う
条件
- boolean login = true
- boolean paid = true
- 両方 true なら「利用開始」
*/

class a_14_3_3_12 {
    public static void main(String[] args) {
        boolean login = true;
        boolean paid = true;
        if (login && paid) {
            System.out.println("利用開始");
        }
    }
}
