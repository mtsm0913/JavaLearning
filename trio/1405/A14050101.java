/*
問題1：四則演算だけの電卓ロジックを作ろう
条件
1. int a = 7, b = 3
2. String op = "+" （あとで値を変えてテスト）
3. op に応じて計算し、結果を表示
4. / のときは割り算の結果を整数で表示
5. if / else if を使うこと
*/

class A14050101 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        String op = "+";
        int result = 0;
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            result = a / b;
        }
        System.out.println(result);
    }
}
