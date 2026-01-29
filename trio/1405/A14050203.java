import java.util.Scanner;

class A14050203 {
    public static void main(String[] args) {

        // 変数定義
        int a;
        int b;
        String op;
        Scanner sc = new Scanner(System.in);
        int result = 0;
        
        // 入力
        System.out.print("数字を入力してください：");
        a = sc.nextInt();
        System.out.print("数字を入力してください：");
        b = sc.nextInt();
        System.out.print("演算子を入力してください：");
        op = sc.next();
        
        if (b == 0 && op == "/") {
            System.out.println("エラー：ゼロで割ることはできません。");
        }
        
        // 計算
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        } else if (op.equals("/")) {
            result = a / b;
        }
        
        // 出力
        System.out.println("計算結果：" + result);
        // System.out.println(result);
        
        // クローズ
        sc.close();
    }
}
