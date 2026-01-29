/*
問題1：2つの数を入力して足し算する
条件
- Scannerを使う
- 2つの数を nextInt で入力
- 合計を表示
*/

import java.util.Scanner;

class A14050201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください：");
        int a = sc.nextInt();
        System.out.print("数字を入力してください：");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("結果：" + result);
        sc.close();
    }
}
