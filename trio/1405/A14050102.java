/*
問題2：0割りチェックを追加した電卓ロジック
条件
1. int a = 10, b = 0
2. op="/" のとき
  - b が 0 →「0では割れません」
  - それ以外 → 割り算
3. それ以外の演算子は普通に計算
4. println で結果を出す
*/

class A14050102 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        String op = "/";

        if (op.equals("/") && b == 0) {
            System.out.println("0では割れません");
        } else if (op.equals("+")) {
            System.out.println(a + b);
        } else if (op.equals("-")) {
            System.out.println(a - b);
        } else if (op.equals("*")) {
            System.out.println(a * b);
        } else if (op.equals("/")) {
            System.out.println(a / b);
        }
    }
}
