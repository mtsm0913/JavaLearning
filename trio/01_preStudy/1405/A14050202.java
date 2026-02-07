/*
問題2：演算子を入力して計算する電卓（簡易版）
条件
- a, b を nextInt
- 演算子 op を next
  - と - のみ対応
- if で分岐
*/

import java.util.Scanner;

class A14050202 {
    public static void main(String[] args) {

        // 変数定義
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        String op;
        int result;

        // 入力受取
        System.out.print("数字を入力してください：");
        a = sc.nextInt();
        System.out.print("数字を入力してください：");
        b = sc.nextInt();
        System.out.print("演算子を入力してください（+か-のいずれか）：");
        op = sc.next();

        // 計算
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else {
            System.out.println("演算子が不正のため中止");
            return;
        }
        
        // 出力
        System.out.println("計算結果：" + result);
    }
}
